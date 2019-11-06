/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import java.util.Date;

import org.abchip.mimo.biz.content.survey.Survey;
import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.SurveyQuestion;
import org.abchip.mimo.biz.content.survey.SurveyQuestionAppl;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Question Appl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionApplImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionApplImpl#getExternalFieldRef <em>External Field Ref</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionApplImpl#isRequiredField <em>Required Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionApplImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionApplImpl#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionApplImpl#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionApplImpl#getSurveyPageSeqId <em>Survey Page Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionApplImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionApplImpl#getWithSurveyOptionSeqId <em>With Survey Option Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionApplImpl#getWithSurveyQuestionId <em>With Survey Question Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionApplImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionApplImpl#getSurveyQuestionId <em>Survey Question Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyQuestionApplImpl extends BizEntityImpl implements SurveyQuestionAppl {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalFieldRef() <em>External Field Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFieldRef()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_FIELD_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalFieldRef() <em>External Field Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFieldRef()
	 * @generated
	 * @ordered
	 */
	protected String externalFieldRef = EXTERNAL_FIELD_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequiredField() <em>Required Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiredField()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_FIELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiredField() <em>Required Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiredField()
	 * @generated
	 * @ordered
	 */
	protected boolean requiredField = REQUIRED_FIELD_EDEFAULT;

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
	 * The default value of the '{@link #getSurveyPageSeqId() <em>Survey Page Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyPageSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_PAGE_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyPageSeqId() <em>Survey Page Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyPageSeqId()
	 * @generated
	 * @ordered
	 */
	protected String surveyPageSeqId = SURVEY_PAGE_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWithSurveyOptionSeqId() <em>With Survey Option Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithSurveyOptionSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String WITH_SURVEY_OPTION_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWithSurveyOptionSeqId() <em>With Survey Option Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithSurveyOptionSeqId()
	 * @generated
	 * @ordered
	 */
	protected String withSurveyOptionSeqId = WITH_SURVEY_OPTION_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWithSurveyQuestionId() <em>With Survey Question Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithSurveyQuestionId()
	 * @generated
	 * @ordered
	 */
	protected static final String WITH_SURVEY_QUESTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWithSurveyQuestionId() <em>With Survey Question Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithSurveyQuestionId()
	 * @generated
	 * @ordered
	 */
	protected String withSurveyQuestionId = WITH_SURVEY_QUESTION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSurveyId() <em>Survey Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyId()
	 * @generated
	 * @ordered
	 */
	protected Survey surveyId;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyQuestionApplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY_QUESTION_APPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalFieldRef() {
		return externalFieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalFieldRef(String newExternalFieldRef) {
		externalFieldRef = newExternalFieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequiredField() {
		return requiredField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredField(boolean newRequiredField) {
		requiredField = newRequiredField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
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
	public Survey getSurveyId() {
		if (surveyId != null && ((EObject)surveyId).eIsProxy()) {
			InternalEObject oldSurveyId = (InternalEObject)surveyId;
			surveyId = (Survey)eResolveProxy(oldSurveyId);
			if (surveyId != oldSurveyId) {
			}
		}
		return surveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey basicGetSurveyId() {
		return surveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyId(Survey newSurveyId) {
		surveyId = newSurveyId;
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
	public String getSurveyPageSeqId() {
		return surveyPageSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyPageSeqId(String newSurveyPageSeqId) {
		surveyPageSeqId = newSurveyPageSeqId;
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
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWithSurveyOptionSeqId() {
		return withSurveyOptionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWithSurveyOptionSeqId(String newWithSurveyOptionSeqId) {
		withSurveyOptionSeqId = newWithSurveyOptionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWithSurveyQuestionId() {
		return withSurveyQuestionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWithSurveyQuestionId(String newWithSurveyQuestionId) {
		withSurveyQuestionId = newWithSurveyQuestionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.SURVEY_QUESTION_APPL__FROM_DATE:
				return getFromDate();
			case SurveyPackage.SURVEY_QUESTION_APPL__EXTERNAL_FIELD_REF:
				return getExternalFieldRef();
			case SurveyPackage.SURVEY_QUESTION_APPL__REQUIRED_FIELD:
				return isRequiredField();
			case SurveyPackage.SURVEY_QUESTION_APPL__SEQUENCE_NUM:
				return getSequenceNum();
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_COL_ID:
				return getSurveyMultiRespColId();
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_ID:
				return getSurveyMultiRespId();
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_PAGE_SEQ_ID:
				return getSurveyPageSeqId();
			case SurveyPackage.SURVEY_QUESTION_APPL__THRU_DATE:
				return getThruDate();
			case SurveyPackage.SURVEY_QUESTION_APPL__WITH_SURVEY_OPTION_SEQ_ID:
				return getWithSurveyOptionSeqId();
			case SurveyPackage.SURVEY_QUESTION_APPL__WITH_SURVEY_QUESTION_ID:
				return getWithSurveyQuestionId();
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_ID:
				if (resolve) return getSurveyId();
				return basicGetSurveyId();
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_QUESTION_ID:
				if (resolve) return getSurveyQuestionId();
				return basicGetSurveyQuestionId();
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
			case SurveyPackage.SURVEY_QUESTION_APPL__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__EXTERNAL_FIELD_REF:
				setExternalFieldRef((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__REQUIRED_FIELD:
				setRequiredField((Boolean)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_COL_ID:
				setSurveyMultiRespColId((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_ID:
				setSurveyMultiRespId((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_PAGE_SEQ_ID:
				setSurveyPageSeqId((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__WITH_SURVEY_OPTION_SEQ_ID:
				setWithSurveyOptionSeqId((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__WITH_SURVEY_QUESTION_ID:
				setWithSurveyQuestionId((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_ID:
				setSurveyId((Survey)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_QUESTION_ID:
				setSurveyQuestionId((SurveyQuestion)newValue);
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
			case SurveyPackage.SURVEY_QUESTION_APPL__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__EXTERNAL_FIELD_REF:
				setExternalFieldRef(EXTERNAL_FIELD_REF_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__REQUIRED_FIELD:
				setRequiredField(REQUIRED_FIELD_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_COL_ID:
				setSurveyMultiRespColId(SURVEY_MULTI_RESP_COL_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_ID:
				setSurveyMultiRespId(SURVEY_MULTI_RESP_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_PAGE_SEQ_ID:
				setSurveyPageSeqId(SURVEY_PAGE_SEQ_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__WITH_SURVEY_OPTION_SEQ_ID:
				setWithSurveyOptionSeqId(WITH_SURVEY_OPTION_SEQ_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__WITH_SURVEY_QUESTION_ID:
				setWithSurveyQuestionId(WITH_SURVEY_QUESTION_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_ID:
				setSurveyId((Survey)null);
				return;
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_QUESTION_ID:
				setSurveyQuestionId((SurveyQuestion)null);
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
			case SurveyPackage.SURVEY_QUESTION_APPL__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case SurveyPackage.SURVEY_QUESTION_APPL__EXTERNAL_FIELD_REF:
				return EXTERNAL_FIELD_REF_EDEFAULT == null ? externalFieldRef != null : !EXTERNAL_FIELD_REF_EDEFAULT.equals(externalFieldRef);
			case SurveyPackage.SURVEY_QUESTION_APPL__REQUIRED_FIELD:
				return requiredField != REQUIRED_FIELD_EDEFAULT;
			case SurveyPackage.SURVEY_QUESTION_APPL__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_COL_ID:
				return SURVEY_MULTI_RESP_COL_ID_EDEFAULT == null ? surveyMultiRespColId != null : !SURVEY_MULTI_RESP_COL_ID_EDEFAULT.equals(surveyMultiRespColId);
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_ID:
				return SURVEY_MULTI_RESP_ID_EDEFAULT == null ? surveyMultiRespId != null : !SURVEY_MULTI_RESP_ID_EDEFAULT.equals(surveyMultiRespId);
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_PAGE_SEQ_ID:
				return SURVEY_PAGE_SEQ_ID_EDEFAULT == null ? surveyPageSeqId != null : !SURVEY_PAGE_SEQ_ID_EDEFAULT.equals(surveyPageSeqId);
			case SurveyPackage.SURVEY_QUESTION_APPL__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case SurveyPackage.SURVEY_QUESTION_APPL__WITH_SURVEY_OPTION_SEQ_ID:
				return WITH_SURVEY_OPTION_SEQ_ID_EDEFAULT == null ? withSurveyOptionSeqId != null : !WITH_SURVEY_OPTION_SEQ_ID_EDEFAULT.equals(withSurveyOptionSeqId);
			case SurveyPackage.SURVEY_QUESTION_APPL__WITH_SURVEY_QUESTION_ID:
				return WITH_SURVEY_QUESTION_ID_EDEFAULT == null ? withSurveyQuestionId != null : !WITH_SURVEY_QUESTION_ID_EDEFAULT.equals(withSurveyQuestionId);
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_ID:
				return surveyId != null;
			case SurveyPackage.SURVEY_QUESTION_APPL__SURVEY_QUESTION_ID:
				return surveyQuestionId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", externalFieldRef: ");
		result.append(externalFieldRef);
		result.append(", requiredField: ");
		result.append(requiredField);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", surveyMultiRespColId: ");
		result.append(surveyMultiRespColId);
		result.append(", surveyMultiRespId: ");
		result.append(surveyMultiRespId);
		result.append(", surveyPageSeqId: ");
		result.append(surveyPageSeqId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", withSurveyOptionSeqId: ");
		result.append(withSurveyOptionSeqId);
		result.append(", withSurveyQuestionId: ");
		result.append(withSurveyQuestionId);
		result.append(')');
		return result.toString();
	}

} //SurveyQuestionApplImpl
