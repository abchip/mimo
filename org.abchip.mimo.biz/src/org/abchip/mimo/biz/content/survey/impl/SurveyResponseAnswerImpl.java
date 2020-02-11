/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.SurveyQuestion;
import org.abchip.mimo.biz.content.survey.SurveyResponse;
import org.abchip.mimo.biz.content.survey.SurveyResponseAnswer;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Response Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getSurveyResponseId <em>Survey Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getSurveyQuestionId <em>Survey Question Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getAmountBase <em>Amount Base</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getAmountBaseUomId <em>Amount Base Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getAnsweredDate <em>Answered Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#isBooleanResponse <em>Boolean Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getCurrencyResponse <em>Currency Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getDurationUomId <em>Duration Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getFloatResponse <em>Float Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getNumericResponse <em>Numeric Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getSurveyOptionSeqId <em>Survey Option Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getTextResponse <em>Text Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getWeightFactor <em>Weight Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyResponseAnswerImpl extends BizEntityImpl implements SurveyResponseAnswer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyResponseAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmountBase() {
		return (BigDecimal)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__AMOUNT_BASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountBase(BigDecimal newAmountBase) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__AMOUNT_BASE, newAmountBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAmountBaseUomId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__AMOUNT_BASE_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountBaseUomId(String newAmountBaseUomId) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__AMOUNT_BASE_UOM_ID, newAmountBaseUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAnsweredDate() {
		return (Date)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__ANSWERED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnsweredDate(Date newAnsweredDate) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__ANSWERED_DATE, newAnsweredDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBooleanResponse() {
		return (Boolean)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__BOOLEAN_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanResponse(boolean newBooleanResponse) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__BOOLEAN_RESPONSE, newBooleanResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getContentId() {
		return (Content)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(Content newContentId) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__CONTENT_ID, newContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCurrencyResponse() {
		return (BigDecimal)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__CURRENCY_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyResponse(BigDecimal newCurrencyResponse) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__CURRENCY_RESPONSE, newCurrencyResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDuration() {
		return (Long)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__DURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(long newDuration) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDurationUomId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__DURATION_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationUomId(String newDurationUomId) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__DURATION_UOM_ID, newDurationUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFloatResponse() {
		return (Double)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__FLOAT_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloatResponse(double newFloatResponse) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__FLOAT_RESPONSE, newFloatResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumericResponse() {
		return (Long)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__NUMERIC_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumericResponse(long newNumericResponse) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__NUMERIC_RESPONSE, newNumericResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return (Long)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__SEQUENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__SEQUENCE_NUM, newSequenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyMultiRespColId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_COL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyMultiRespColId(String newSurveyMultiRespColId) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_COL_ID, newSurveyMultiRespColId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyMultiRespId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyMultiRespId(String newSurveyMultiRespId) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_ID, newSurveyMultiRespId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyOptionSeqId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__SURVEY_OPTION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyOptionSeqId(String newSurveyOptionSeqId) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__SURVEY_OPTION_SEQ_ID, newSurveyOptionSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyQuestion getSurveyQuestionId() {
		return (SurveyQuestion)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__SURVEY_QUESTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyQuestionId(SurveyQuestion newSurveyQuestionId) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__SURVEY_QUESTION_ID, newSurveyQuestionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyResponse getSurveyResponseId() {
		return (SurveyResponse)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__SURVEY_RESPONSE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyResponseId(SurveyResponse newSurveyResponseId) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__SURVEY_RESPONSE_ID, newSurveyResponseId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextResponse() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__TEXT_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextResponse(String newTextResponse) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__TEXT_RESPONSE, newTextResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeightFactor() {
		return (Double)eGet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__WEIGHT_FACTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightFactor(double newWeightFactor) {
		eSet(SurveyPackage.Literals.SURVEY_RESPONSE_ANSWER__WEIGHT_FACTOR, newWeightFactor);
	}

} //SurveyResponseAnswerImpl
