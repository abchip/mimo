/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.SurveyQuestion;
import org.abchip.mimo.biz.content.survey.SurveyQuestionOption;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Question Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getSurveyOptionSeqId <em>Survey Option Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getAmountBase <em>Amount Base</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getAmountBaseUomId <em>Amount Base Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getDurationUomId <em>Duration Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getWeightFactor <em>Weight Factor</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getSurveyQuestionId <em>Survey Question Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyQuestionOptionImpl extends BizEntityImpl implements SurveyQuestionOption {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	protected SurveyQuestionOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY_QUESTION_OPTION;
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
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
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
			case SurveyPackage.SURVEY_QUESTION_OPTION__SURVEY_OPTION_SEQ_ID:
				return getSurveyOptionSeqId();
			case SurveyPackage.SURVEY_QUESTION_OPTION__AMOUNT_BASE:
				return getAmountBase();
			case SurveyPackage.SURVEY_QUESTION_OPTION__AMOUNT_BASE_UOM_ID:
				return getAmountBaseUomId();
			case SurveyPackage.SURVEY_QUESTION_OPTION__DESCRIPTION:
				return getDescription();
			case SurveyPackage.SURVEY_QUESTION_OPTION__DURATION:
				return getDuration();
			case SurveyPackage.SURVEY_QUESTION_OPTION__DURATION_UOM_ID:
				return getDurationUomId();
			case SurveyPackage.SURVEY_QUESTION_OPTION__SEQUENCE_NUM:
				return getSequenceNum();
			case SurveyPackage.SURVEY_QUESTION_OPTION__WEIGHT_FACTOR:
				return getWeightFactor();
			case SurveyPackage.SURVEY_QUESTION_OPTION__SURVEY_QUESTION_ID:
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
			case SurveyPackage.SURVEY_QUESTION_OPTION__SURVEY_OPTION_SEQ_ID:
				setSurveyOptionSeqId((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__AMOUNT_BASE:
				setAmountBase((BigDecimal)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__AMOUNT_BASE_UOM_ID:
				setAmountBaseUomId((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__DURATION:
				setDuration((Long)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__DURATION_UOM_ID:
				setDurationUomId((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__WEIGHT_FACTOR:
				setWeightFactor((Double)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__SURVEY_QUESTION_ID:
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
			case SurveyPackage.SURVEY_QUESTION_OPTION__SURVEY_OPTION_SEQ_ID:
				setSurveyOptionSeqId(SURVEY_OPTION_SEQ_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__AMOUNT_BASE:
				setAmountBase(AMOUNT_BASE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__AMOUNT_BASE_UOM_ID:
				setAmountBaseUomId(AMOUNT_BASE_UOM_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__DURATION_UOM_ID:
				setDurationUomId(DURATION_UOM_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__WEIGHT_FACTOR:
				setWeightFactor(WEIGHT_FACTOR_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_OPTION__SURVEY_QUESTION_ID:
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
			case SurveyPackage.SURVEY_QUESTION_OPTION__SURVEY_OPTION_SEQ_ID:
				return SURVEY_OPTION_SEQ_ID_EDEFAULT == null ? surveyOptionSeqId != null : !SURVEY_OPTION_SEQ_ID_EDEFAULT.equals(surveyOptionSeqId);
			case SurveyPackage.SURVEY_QUESTION_OPTION__AMOUNT_BASE:
				return AMOUNT_BASE_EDEFAULT == null ? amountBase != null : !AMOUNT_BASE_EDEFAULT.equals(amountBase);
			case SurveyPackage.SURVEY_QUESTION_OPTION__AMOUNT_BASE_UOM_ID:
				return AMOUNT_BASE_UOM_ID_EDEFAULT == null ? amountBaseUomId != null : !AMOUNT_BASE_UOM_ID_EDEFAULT.equals(amountBaseUomId);
			case SurveyPackage.SURVEY_QUESTION_OPTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SurveyPackage.SURVEY_QUESTION_OPTION__DURATION:
				return duration != DURATION_EDEFAULT;
			case SurveyPackage.SURVEY_QUESTION_OPTION__DURATION_UOM_ID:
				return DURATION_UOM_ID_EDEFAULT == null ? durationUomId != null : !DURATION_UOM_ID_EDEFAULT.equals(durationUomId);
			case SurveyPackage.SURVEY_QUESTION_OPTION__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case SurveyPackage.SURVEY_QUESTION_OPTION__WEIGHT_FACTOR:
				return weightFactor != WEIGHT_FACTOR_EDEFAULT;
			case SurveyPackage.SURVEY_QUESTION_OPTION__SURVEY_QUESTION_ID:
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
		result.append(" (surveyOptionSeqId: ");
		result.append(surveyOptionSeqId);
		result.append(", amountBase: ");
		result.append(amountBase);
		result.append(", amountBaseUomId: ");
		result.append(amountBaseUomId);
		result.append(", description: ");
		result.append(description);
		result.append(", duration: ");
		result.append(duration);
		result.append(", durationUomId: ");
		result.append(durationUomId);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", weightFactor: ");
		result.append(weightFactor);
		result.append(')');
		return result.toString();
	}

} //SurveyQuestionOptionImpl
