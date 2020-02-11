/**
 * Copyright (c) 2017, 2020 ABChip and others.
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Question Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getSurveyQuestionId <em>Survey Question Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getSurveyOptionSeqId <em>Survey Option Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getAmountBase <em>Amount Base</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getAmountBaseUomId <em>Amount Base Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getDurationUomId <em>Duration Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionOptionImpl#getWeightFactor <em>Weight Factor</em>}</li>
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
		return (BigDecimal)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__AMOUNT_BASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountBase(BigDecimal newAmountBase) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__AMOUNT_BASE, newAmountBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAmountBaseUomId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__AMOUNT_BASE_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountBaseUomId(String newAmountBaseUomId) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__AMOUNT_BASE_UOM_ID, newAmountBaseUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDuration() {
		return (Long)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__DURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(long newDuration) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDurationUomId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__DURATION_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationUomId(String newDurationUomId) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__DURATION_UOM_ID, newDurationUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return (Long)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__SEQUENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__SEQUENCE_NUM, newSequenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyOptionSeqId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__SURVEY_OPTION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyOptionSeqId(String newSurveyOptionSeqId) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__SURVEY_OPTION_SEQ_ID, newSurveyOptionSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyQuestion getSurveyQuestionId() {
		return (SurveyQuestion)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__SURVEY_QUESTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyQuestionId(SurveyQuestion newSurveyQuestionId) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__SURVEY_QUESTION_ID, newSurveyQuestionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeightFactor() {
		return (Double)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__WEIGHT_FACTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightFactor(double newWeightFactor) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__WEIGHT_FACTOR, newWeightFactor);
	}

} //SurveyQuestionOptionImpl
