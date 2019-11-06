/**
 * Copyright (c) 2017, 2019 ABChip and others.
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Response Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getAmountBase <em>Amount Base</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getAmountBaseUomId <em>Amount Base Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getAnsweredDate <em>Answered Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#isBooleanResponse <em>Boolean Response</em>}</li>
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
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getSurveyResponseId <em>Survey Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getSurveyQuestionId <em>Survey Question Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseAnswerImpl#getContentId <em>Content Id</em>}</li>
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
	 * The default value of the '{@link #getSurveyMultiRespColId() <em>Survey Multi Resp Col Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyMultiRespColId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_MULTI_RESP_COL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyMultiRespColId() <em>Survey Multi Resp Col Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyMultiRespColId()
	 * @generated
	 * @ordered
	 */
	protected String surveyMultiRespColId = SURVEY_MULTI_RESP_COL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountBase() <em>Amount Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountBase()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmountBase() <em>Amount Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountBase()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amountBase = AMOUNT_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountBaseUomId() <em>Amount Base Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountBaseUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String AMOUNT_BASE_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmountBaseUomId() <em>Amount Base Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountBaseUomId()
	 * @generated
	 * @ordered
	 */
	protected String amountBaseUomId = AMOUNT_BASE_UOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnsweredDate() <em>Answered Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnsweredDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ANSWERED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnsweredDate() <em>Answered Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnsweredDate()
	 * @generated
	 * @ordered
	 */
	protected Date answeredDate = ANSWERED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBooleanResponse() <em>Boolean Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanResponse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_RESPONSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBooleanResponse() <em>Boolean Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanResponse()
	 * @generated
	 * @ordered
	 */
	protected boolean booleanResponse = BOOLEAN_RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyResponse() <em>Currency Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyResponse()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CURRENCY_RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyResponse() <em>Currency Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyResponse()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal currencyResponse = CURRENCY_RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected long duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationUomId() <em>Duration Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDurationUomId() <em>Duration Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationUomId()
	 * @generated
	 * @ordered
	 */
	protected String durationUomId = DURATION_UOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloatResponse() <em>Float Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatResponse()
	 * @generated
	 * @ordered
	 */
	protected static final double FLOAT_RESPONSE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFloatResponse() <em>Float Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatResponse()
	 * @generated
	 * @ordered
	 */
	protected double floatResponse = FLOAT_RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumericResponse() <em>Numeric Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericResponse()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERIC_RESPONSE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumericResponse() <em>Numeric Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericResponse()
	 * @generated
	 * @ordered
	 */
	protected long numericResponse = NUMERIC_RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurveyMultiRespId() <em>Survey Multi Resp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyMultiRespId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_MULTI_RESP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyMultiRespId() <em>Survey Multi Resp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyMultiRespId()
	 * @generated
	 * @ordered
	 */
	protected String surveyMultiRespId = SURVEY_MULTI_RESP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurveyOptionSeqId() <em>Survey Option Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyOptionSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_OPTION_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyOptionSeqId() <em>Survey Option Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyOptionSeqId()
	 * @generated
	 * @ordered
	 */
	protected String surveyOptionSeqId = SURVEY_OPTION_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextResponse() <em>Text Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextResponse()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextResponse() <em>Text Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextResponse()
	 * @generated
	 * @ordered
	 */
	protected String textResponse = TEXT_RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeightFactor() <em>Weight Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeightFactor() <em>Weight Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightFactor()
	 * @generated
	 * @ordered
	 */
	protected double weightFactor = WEIGHT_FACTOR_EDEFAULT;

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
	 * The cached value of the '{@link #getSurveyQuestionId() <em>Survey Question Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyQuestionId()
	 * @generated
	 * @ordered
	 */
	protected SurveyQuestion surveyQuestionId;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected Content contentId;

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
		return amountBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountBase(BigDecimal newAmountBase) {
		amountBase = newAmountBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAmountBaseUomId() {
		return amountBaseUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountBaseUomId(String newAmountBaseUomId) {
		amountBaseUomId = newAmountBaseUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAnsweredDate() {
		return answeredDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnsweredDate(Date newAnsweredDate) {
		answeredDate = newAnsweredDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBooleanResponse() {
		return booleanResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanResponse(boolean newBooleanResponse) {
		booleanResponse = newBooleanResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getContentId() {
		if (contentId != null && ((EObject)contentId).eIsProxy()) {
			InternalEObject oldContentId = (InternalEObject)contentId;
			contentId = (Content)eResolveProxy(oldContentId);
			if (contentId != oldContentId) {
			}
		}
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(Content newContentId) {
		contentId = newContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCurrencyResponse() {
		return currencyResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyResponse(BigDecimal newCurrencyResponse) {
		currencyResponse = newCurrencyResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(long newDuration) {
		duration = newDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDurationUomId() {
		return durationUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationUomId(String newDurationUomId) {
		durationUomId = newDurationUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFloatResponse() {
		return floatResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloatResponse(double newFloatResponse) {
		floatResponse = newFloatResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumericResponse() {
		return numericResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumericResponse(long newNumericResponse) {
		numericResponse = newNumericResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		sequenceNum = newSequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyMultiRespColId() {
		return surveyMultiRespColId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyMultiRespColId(String newSurveyMultiRespColId) {
		surveyMultiRespColId = newSurveyMultiRespColId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyMultiRespId() {
		return surveyMultiRespId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyMultiRespId(String newSurveyMultiRespId) {
		surveyMultiRespId = newSurveyMultiRespId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyOptionSeqId() {
		return surveyOptionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyOptionSeqId(String newSurveyOptionSeqId) {
		surveyOptionSeqId = newSurveyOptionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyQuestion getSurveyQuestionId() {
		if (surveyQuestionId != null && ((EObject)surveyQuestionId).eIsProxy()) {
			InternalEObject oldSurveyQuestionId = (InternalEObject)surveyQuestionId;
			surveyQuestionId = (SurveyQuestion)eResolveProxy(oldSurveyQuestionId);
			if (surveyQuestionId != oldSurveyQuestionId) {
			}
		}
		return surveyQuestionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyQuestion basicGetSurveyQuestionId() {
		return surveyQuestionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyQuestionId(SurveyQuestion newSurveyQuestionId) {
		surveyQuestionId = newSurveyQuestionId;
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
	public String getTextResponse() {
		return textResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextResponse(String newTextResponse) {
		textResponse = newTextResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeightFactor() {
		return weightFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightFactor(double newWeightFactor) {
		weightFactor = newWeightFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_COL_ID:
				return getSurveyMultiRespColId();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__AMOUNT_BASE:
				return getAmountBase();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__AMOUNT_BASE_UOM_ID:
				return getAmountBaseUomId();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__ANSWERED_DATE:
				return getAnsweredDate();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__BOOLEAN_RESPONSE:
				return isBooleanResponse();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__CURRENCY_RESPONSE:
				return getCurrencyResponse();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__DURATION:
				return getDuration();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__DURATION_UOM_ID:
				return getDurationUomId();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__FLOAT_RESPONSE:
				return getFloatResponse();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__NUMERIC_RESPONSE:
				return getNumericResponse();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SEQUENCE_NUM:
				return getSequenceNum();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_ID:
				return getSurveyMultiRespId();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_OPTION_SEQ_ID:
				return getSurveyOptionSeqId();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__TEXT_RESPONSE:
				return getTextResponse();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__WEIGHT_FACTOR:
				return getWeightFactor();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_RESPONSE_ID:
				if (resolve) return getSurveyResponseId();
				return basicGetSurveyResponseId();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_QUESTION_ID:
				if (resolve) return getSurveyQuestionId();
				return basicGetSurveyQuestionId();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__CONTENT_ID:
				if (resolve) return getContentId();
				return basicGetContentId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_COL_ID:
				setSurveyMultiRespColId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__AMOUNT_BASE:
				setAmountBase((BigDecimal)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__AMOUNT_BASE_UOM_ID:
				setAmountBaseUomId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__ANSWERED_DATE:
				setAnsweredDate((Date)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__BOOLEAN_RESPONSE:
				setBooleanResponse((Boolean)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__CURRENCY_RESPONSE:
				setCurrencyResponse((BigDecimal)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__DURATION:
				setDuration((Long)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__DURATION_UOM_ID:
				setDurationUomId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__FLOAT_RESPONSE:
				setFloatResponse((Double)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__NUMERIC_RESPONSE:
				setNumericResponse((Long)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_ID:
				setSurveyMultiRespId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_OPTION_SEQ_ID:
				setSurveyOptionSeqId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__TEXT_RESPONSE:
				setTextResponse((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__WEIGHT_FACTOR:
				setWeightFactor((Double)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_RESPONSE_ID:
				setSurveyResponseId((SurveyResponse)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_QUESTION_ID:
				setSurveyQuestionId((SurveyQuestion)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__CONTENT_ID:
				setContentId((Content)newValue);
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
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_COL_ID:
				setSurveyMultiRespColId(SURVEY_MULTI_RESP_COL_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__AMOUNT_BASE:
				setAmountBase(AMOUNT_BASE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__AMOUNT_BASE_UOM_ID:
				setAmountBaseUomId(AMOUNT_BASE_UOM_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__ANSWERED_DATE:
				setAnsweredDate(ANSWERED_DATE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__BOOLEAN_RESPONSE:
				setBooleanResponse(BOOLEAN_RESPONSE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__CURRENCY_RESPONSE:
				setCurrencyResponse(CURRENCY_RESPONSE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__DURATION_UOM_ID:
				setDurationUomId(DURATION_UOM_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__FLOAT_RESPONSE:
				setFloatResponse(FLOAT_RESPONSE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__NUMERIC_RESPONSE:
				setNumericResponse(NUMERIC_RESPONSE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_ID:
				setSurveyMultiRespId(SURVEY_MULTI_RESP_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_OPTION_SEQ_ID:
				setSurveyOptionSeqId(SURVEY_OPTION_SEQ_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__TEXT_RESPONSE:
				setTextResponse(TEXT_RESPONSE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__WEIGHT_FACTOR:
				setWeightFactor(WEIGHT_FACTOR_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_RESPONSE_ID:
				setSurveyResponseId((SurveyResponse)null);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_QUESTION_ID:
				setSurveyQuestionId((SurveyQuestion)null);
				return;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__CONTENT_ID:
				setContentId((Content)null);
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
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_COL_ID:
				return SURVEY_MULTI_RESP_COL_ID_EDEFAULT == null ? surveyMultiRespColId != null : !SURVEY_MULTI_RESP_COL_ID_EDEFAULT.equals(surveyMultiRespColId);
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__AMOUNT_BASE:
				return AMOUNT_BASE_EDEFAULT == null ? amountBase != null : !AMOUNT_BASE_EDEFAULT.equals(amountBase);
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__AMOUNT_BASE_UOM_ID:
				return AMOUNT_BASE_UOM_ID_EDEFAULT == null ? amountBaseUomId != null : !AMOUNT_BASE_UOM_ID_EDEFAULT.equals(amountBaseUomId);
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__ANSWERED_DATE:
				return ANSWERED_DATE_EDEFAULT == null ? answeredDate != null : !ANSWERED_DATE_EDEFAULT.equals(answeredDate);
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__BOOLEAN_RESPONSE:
				return booleanResponse != BOOLEAN_RESPONSE_EDEFAULT;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__CURRENCY_RESPONSE:
				return CURRENCY_RESPONSE_EDEFAULT == null ? currencyResponse != null : !CURRENCY_RESPONSE_EDEFAULT.equals(currencyResponse);
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__DURATION:
				return duration != DURATION_EDEFAULT;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__DURATION_UOM_ID:
				return DURATION_UOM_ID_EDEFAULT == null ? durationUomId != null : !DURATION_UOM_ID_EDEFAULT.equals(durationUomId);
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__FLOAT_RESPONSE:
				return floatResponse != FLOAT_RESPONSE_EDEFAULT;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__NUMERIC_RESPONSE:
				return numericResponse != NUMERIC_RESPONSE_EDEFAULT;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_ID:
				return SURVEY_MULTI_RESP_ID_EDEFAULT == null ? surveyMultiRespId != null : !SURVEY_MULTI_RESP_ID_EDEFAULT.equals(surveyMultiRespId);
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_OPTION_SEQ_ID:
				return SURVEY_OPTION_SEQ_ID_EDEFAULT == null ? surveyOptionSeqId != null : !SURVEY_OPTION_SEQ_ID_EDEFAULT.equals(surveyOptionSeqId);
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__TEXT_RESPONSE:
				return TEXT_RESPONSE_EDEFAULT == null ? textResponse != null : !TEXT_RESPONSE_EDEFAULT.equals(textResponse);
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__WEIGHT_FACTOR:
				return weightFactor != WEIGHT_FACTOR_EDEFAULT;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_RESPONSE_ID:
				return surveyResponseId != null;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__SURVEY_QUESTION_ID:
				return surveyQuestionId != null;
			case SurveyPackage.SURVEY_RESPONSE_ANSWER__CONTENT_ID:
				return contentId != null;
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
		result.append(" (surveyMultiRespColId: ");
		result.append(surveyMultiRespColId);
		result.append(", amountBase: ");
		result.append(amountBase);
		result.append(", amountBaseUomId: ");
		result.append(amountBaseUomId);
		result.append(", answeredDate: ");
		result.append(answeredDate);
		result.append(", booleanResponse: ");
		result.append(booleanResponse);
		result.append(", currencyResponse: ");
		result.append(currencyResponse);
		result.append(", duration: ");
		result.append(duration);
		result.append(", durationUomId: ");
		result.append(durationUomId);
		result.append(", floatResponse: ");
		result.append(floatResponse);
		result.append(", numericResponse: ");
		result.append(numericResponse);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", surveyMultiRespId: ");
		result.append(surveyMultiRespId);
		result.append(", surveyOptionSeqId: ");
		result.append(surveyOptionSeqId);
		result.append(", textResponse: ");
		result.append(textResponse);
		result.append(", weightFactor: ");
		result.append(weightFactor);
		result.append(')');
		return result.toString();
	}

} //SurveyResponseAnswerImpl
