/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Question Appl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getExternalFieldRef <em>External Field Ref</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#isRequiredField <em>Required Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getSurveyPageSeqId <em>Survey Page Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getWithSurveyOptionSeqId <em>With Survey Option Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getWithSurveyQuestionId <em>With Survey Question Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getSurveyQuestionId <em>Survey Question Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl()
 * @model
 * @generated
 */
public interface SurveyQuestionAppl extends BizEntity {
	/**
	 * Returns the value of the '<em><b>External Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Field Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Field Ref</em>' attribute.
	 * @see #setExternalFieldRef(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl_ExternalFieldRef()
	 * @model
	 * @generated
	 */
	String getExternalFieldRef();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getExternalFieldRef <em>External Field Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Field Ref</em>' attribute.
	 * @see #getExternalFieldRef()
	 * @generated
	 */
	void setExternalFieldRef(String value);

	/**
	 * Returns the value of the '<em><b>Required Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Field</em>' attribute.
	 * @see #setRequiredField(boolean)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl_RequiredField()
	 * @model
	 * @generated
	 */
	boolean isRequiredField();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#isRequiredField <em>Required Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Field</em>' attribute.
	 * @see #isRequiredField()
	 * @generated
	 */
	void setRequiredField(boolean value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

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
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl_SequenceNum()
	 * @model
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

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
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl_SurveyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSurveyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getSurveyId <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Id</em>' attribute.
	 * @see #getSurveyId()
	 * @generated
	 */
	void setSurveyId(String value);

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
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl_SurveyMultiRespColId()
	 * @model
	 * @generated
	 */
	String getSurveyMultiRespColId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl_SurveyMultiRespId()
	 * @model
	 * @generated
	 */
	String getSurveyMultiRespId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Multi Resp Id</em>' attribute.
	 * @see #getSurveyMultiRespId()
	 * @generated
	 */
	void setSurveyMultiRespId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Page Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Page Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Page Seq Id</em>' attribute.
	 * @see #setSurveyPageSeqId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl_SurveyPageSeqId()
	 * @model
	 * @generated
	 */
	String getSurveyPageSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getSurveyPageSeqId <em>Survey Page Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Page Seq Id</em>' attribute.
	 * @see #getSurveyPageSeqId()
	 * @generated
	 */
	void setSurveyPageSeqId(String value);

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
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl_SurveyQuestionId()
	 * @model keys="surveyQuestionId"
	 * @generated
	 */
	SurveyQuestion getSurveyQuestionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getSurveyQuestionId <em>Survey Question Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Question Id</em>' reference.
	 * @see #getSurveyQuestionId()
	 * @generated
	 */
	void setSurveyQuestionId(SurveyQuestion value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>With Survey Option Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Survey Option Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Survey Option Seq Id</em>' attribute.
	 * @see #setWithSurveyOptionSeqId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl_WithSurveyOptionSeqId()
	 * @model
	 * @generated
	 */
	String getWithSurveyOptionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getWithSurveyOptionSeqId <em>With Survey Option Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Survey Option Seq Id</em>' attribute.
	 * @see #getWithSurveyOptionSeqId()
	 * @generated
	 */
	void setWithSurveyOptionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>With Survey Question Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Survey Question Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Survey Question Id</em>' attribute.
	 * @see #setWithSurveyQuestionId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionAppl_WithSurveyQuestionId()
	 * @model
	 * @generated
	 */
	String getWithSurveyQuestionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionAppl#getWithSurveyQuestionId <em>With Survey Question Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Survey Question Id</em>' attribute.
	 * @see #getWithSurveyQuestionId()
	 * @generated
	 */
	void setWithSurveyQuestionId(String value);

} // SurveyQuestionAppl
