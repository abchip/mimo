/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.content.content.Content;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Response Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getSurveyResponseId <em>Survey Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getSurveyQuestionId <em>Survey Question Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getAmountBase <em>Amount Base</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getAmountBaseUomId <em>Amount Base Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getAnsweredDate <em>Answered Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#isBooleanResponse <em>Boolean Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getCurrencyResponse <em>Currency Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getDurationUomId <em>Duration Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getFloatResponse <em>Float Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getNumericResponse <em>Numeric Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getSurveyOptionSeqId <em>Survey Option Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getTextResponse <em>Text Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getWeightFactor <em>Weight Factor</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer()
 * @model
 * @generated
 */
public interface SurveyResponseAnswer extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Amount Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Base</em>' attribute.
	 * @see #setAmountBase(BigDecimal)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_AmountBase()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmountBase();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getAmountBase <em>Amount Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Base</em>' attribute.
	 * @see #getAmountBase()
	 * @generated
	 */
	void setAmountBase(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Amount Base Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Base Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Base Uom Id</em>' attribute.
	 * @see #setAmountBaseUomId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_AmountBaseUomId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAmountBaseUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getAmountBaseUomId <em>Amount Base Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Base Uom Id</em>' attribute.
	 * @see #getAmountBaseUomId()
	 * @generated
	 */
	void setAmountBaseUomId(String value);

	/**
	 * Returns the value of the '<em><b>Answered Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answered Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answered Date</em>' attribute.
	 * @see #setAnsweredDate(Date)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_AnsweredDate()
	 * @model
	 * @generated
	 */
	Date getAnsweredDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getAnsweredDate <em>Answered Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answered Date</em>' attribute.
	 * @see #getAnsweredDate()
	 * @generated
	 */
	void setAnsweredDate(Date value);

	/**
	 * Returns the value of the '<em><b>Boolean Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Response</em>' attribute.
	 * @see #setBooleanResponse(boolean)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_BooleanResponse()
	 * @model
	 * @generated
	 */
	boolean isBooleanResponse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#isBooleanResponse <em>Boolean Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Response</em>' attribute.
	 * @see #isBooleanResponse()
	 * @generated
	 */
	void setBooleanResponse(boolean value);

	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' reference.
	 * @see #setContentId(Content)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_ContentId()
	 * @model keys="contentId"
	 * @generated
	 */
	Content getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getContentId <em>Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' reference.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(Content value);

	/**
	 * Returns the value of the '<em><b>Currency Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Response</em>' attribute.
	 * @see #setCurrencyResponse(BigDecimal)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_CurrencyResponse()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getCurrencyResponse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getCurrencyResponse <em>Currency Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Response</em>' attribute.
	 * @see #getCurrencyResponse()
	 * @generated
	 */
	void setCurrencyResponse(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(long)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_Duration()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getDuration();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(long value);

	/**
	 * Returns the value of the '<em><b>Duration Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Uom Id</em>' attribute.
	 * @see #setDurationUomId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_DurationUomId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDurationUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getDurationUomId <em>Duration Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Uom Id</em>' attribute.
	 * @see #getDurationUomId()
	 * @generated
	 */
	void setDurationUomId(String value);

	/**
	 * Returns the value of the '<em><b>Float Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float Response</em>' attribute.
	 * @see #setFloatResponse(double)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_FloatResponse()
	 * @model
	 * @generated
	 */
	double getFloatResponse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getFloatResponse <em>Float Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float Response</em>' attribute.
	 * @see #getFloatResponse()
	 * @generated
	 */
	void setFloatResponse(double value);

	/**
	 * Returns the value of the '<em><b>Numeric Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeric Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Response</em>' attribute.
	 * @see #setNumericResponse(long)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_NumericResponse()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getNumericResponse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getNumericResponse <em>Numeric Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Response</em>' attribute.
	 * @see #getNumericResponse()
	 * @generated
	 */
	void setNumericResponse(long value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Survey Multi Resp Col Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Multi Resp Col Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Multi Resp Col Id</em>' attribute.
	 * @see #setSurveyMultiRespColId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_SurveyMultiRespColId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='This is needed to support multiple responses for different MultiResp Columns; if not part of a MultiResp will be _NA_'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyMultiRespColId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Multi Resp Col Id</em>' attribute.
	 * @see #getSurveyMultiRespColId()
	 * @generated
	 */
	void setSurveyMultiRespColId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Multi Resp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Multi Resp Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Multi Resp Id</em>' attribute.
	 * @see #setSurveyMultiRespId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_SurveyMultiRespId()
	 * @model annotation="mimo-ent-slot help='This is not part of the primary key, but should be populated so that the SurveyMultiRespColumn can be more easily looked up.'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyMultiRespId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Multi Resp Id</em>' attribute.
	 * @see #getSurveyMultiRespId()
	 * @generated
	 */
	void setSurveyMultiRespId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Option Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Option Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Option Seq Id</em>' attribute.
	 * @see #setSurveyOptionSeqId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_SurveyOptionSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyOptionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getSurveyOptionSeqId <em>Survey Option Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Option Seq Id</em>' attribute.
	 * @see #getSurveyOptionSeqId()
	 * @generated
	 */
	void setSurveyOptionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Question Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Question Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Question Id</em>' reference.
	 * @see #setSurveyQuestionId(SurveyQuestion)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_SurveyQuestionId()
	 * @model keys="surveyQuestionId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SurveyQuestion getSurveyQuestionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getSurveyQuestionId <em>Survey Question Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Question Id</em>' reference.
	 * @see #getSurveyQuestionId()
	 * @generated
	 */
	void setSurveyQuestionId(SurveyQuestion value);

	/**
	 * Returns the value of the '<em><b>Survey Response Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Response Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Response Id</em>' reference.
	 * @see #setSurveyResponseId(SurveyResponse)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_SurveyResponseId()
	 * @model keys="surveyResponseId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SurveyResponse getSurveyResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getSurveyResponseId <em>Survey Response Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Response Id</em>' reference.
	 * @see #getSurveyResponseId()
	 * @generated
	 */
	void setSurveyResponseId(SurveyResponse value);

	/**
	 * Returns the value of the '<em><b>Text Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Response</em>' attribute.
	 * @see #setTextResponse(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_TextResponse()
	 * @model
	 * @generated
	 */
	String getTextResponse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getTextResponse <em>Text Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Response</em>' attribute.
	 * @see #getTextResponse()
	 * @generated
	 */
	void setTextResponse(String value);

	/**
	 * Returns the value of the '<em><b>Weight Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Factor</em>' attribute.
	 * @see #setWeightFactor(double)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponseAnswer_WeightFactor()
	 * @model
	 * @generated
	 */
	double getWeightFactor();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponseAnswer#getWeightFactor <em>Weight Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Factor</em>' attribute.
	 * @see #getWeightFactor()
	 * @generated
	 */
	void setWeightFactor(double value);

} // SurveyResponseAnswer
