/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn;
import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Multi Resp Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyMultiRespColumnImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyMultiRespColumnImpl#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyMultiRespColumnImpl#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}</li>
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
	 * The default value of the '{@link #getSurveyId() <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyId() <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyId()
	 * @generated
	 * @ordered
	 */
	protected String surveyId = SURVEY_ID_EDEFAULT;

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
	 * The default value of the '{@link #getColumnTitle() <em>Column Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnTitle() <em>Column Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnTitle()
	 * @generated
	 * @ordered
	 */
	protected String columnTitle = COLUMN_TITLE_EDEFAULT;

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
		return columnTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnTitle(String newColumnTitle) {
		String oldColumnTitle = columnTitle;
		columnTitle = newColumnTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_MULTI_RESP_COLUMN__COLUMN_TITLE, oldColumnTitle, columnTitle));
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
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyId() {
		return surveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyId(String newSurveyId) {
		String oldSurveyId = surveyId;
		surveyId = newSurveyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_ID, oldSurveyId, surveyId));
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
		String oldSurveyMultiRespColId = surveyMultiRespColId;
		surveyMultiRespColId = newSurveyMultiRespColId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_COL_ID, oldSurveyMultiRespColId, surveyMultiRespColId));
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
		String oldSurveyMultiRespId = surveyMultiRespId;
		surveyMultiRespId = newSurveyMultiRespId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_ID, oldSurveyMultiRespId, surveyMultiRespId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_ID:
				return getSurveyId();
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_ID:
				return getSurveyMultiRespId();
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_COL_ID:
				return getSurveyMultiRespColId();
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__COLUMN_TITLE:
				return getColumnTitle();
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SEQUENCE_NUM:
				return getSequenceNum();
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
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_ID:
				setSurveyId((String)newValue);
				return;
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_ID:
				setSurveyMultiRespId((String)newValue);
				return;
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_COL_ID:
				setSurveyMultiRespColId((String)newValue);
				return;
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__COLUMN_TITLE:
				setColumnTitle((String)newValue);
				return;
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
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
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_ID:
				setSurveyId(SURVEY_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_ID:
				setSurveyMultiRespId(SURVEY_MULTI_RESP_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_COL_ID:
				setSurveyMultiRespColId(SURVEY_MULTI_RESP_COL_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__COLUMN_TITLE:
				setColumnTitle(COLUMN_TITLE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
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
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_ID:
				return SURVEY_ID_EDEFAULT == null ? surveyId != null : !SURVEY_ID_EDEFAULT.equals(surveyId);
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_ID:
				return SURVEY_MULTI_RESP_ID_EDEFAULT == null ? surveyMultiRespId != null : !SURVEY_MULTI_RESP_ID_EDEFAULT.equals(surveyMultiRespId);
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_COL_ID:
				return SURVEY_MULTI_RESP_COL_ID_EDEFAULT == null ? surveyMultiRespColId != null : !SURVEY_MULTI_RESP_COL_ID_EDEFAULT.equals(surveyMultiRespColId);
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__COLUMN_TITLE:
				return COLUMN_TITLE_EDEFAULT == null ? columnTitle != null : !COLUMN_TITLE_EDEFAULT.equals(columnTitle);
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
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
		result.append(" (surveyId: ");
		result.append(surveyId);
		result.append(", surveyMultiRespId: ");
		result.append(surveyMultiRespId);
		result.append(", surveyMultiRespColId: ");
		result.append(surveyMultiRespColId);
		result.append(", columnTitle: ");
		result.append(columnTitle);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //SurveyMultiRespColumnImpl
