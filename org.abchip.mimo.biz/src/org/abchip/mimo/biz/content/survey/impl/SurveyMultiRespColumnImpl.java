/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn;
import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Multi Resp Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyMultiRespColumnImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyMultiRespColumnImpl#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyMultiRespColumnImpl#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyMultiRespColumnImpl#getColumnTitle <em>Column Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyMultiRespColumnImpl#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyMultiRespColumnImpl extends BizEntityImpl implements SurveyMultiRespColumn {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyMultiRespColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY_MULTI_RESP_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColumnTitle() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_MULTI_RESP_COLUMN__COLUMN_TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnTitle(String newColumnTitle) {
		eSet(SurveyPackage.Literals.SURVEY_MULTI_RESP_COLUMN__COLUMN_TITLE, newColumnTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return (Long)eGet(SurveyPackage.Literals.SURVEY_MULTI_RESP_COLUMN__SEQUENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		eSet(SurveyPackage.Literals.SURVEY_MULTI_RESP_COLUMN__SEQUENCE_NUM, newSequenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_MULTI_RESP_COLUMN__SURVEY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyId(String newSurveyId) {
		eSet(SurveyPackage.Literals.SURVEY_MULTI_RESP_COLUMN__SURVEY_ID, newSurveyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyMultiRespColId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_COL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyMultiRespColId(String newSurveyMultiRespColId) {
		eSet(SurveyPackage.Literals.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_COL_ID, newSurveyMultiRespColId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyMultiRespId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyMultiRespId(String newSurveyMultiRespId) {
		eSet(SurveyPackage.Literals.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_ID, newSurveyMultiRespId);
	}

} //SurveyMultiRespColumnImpl
