/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.SurveyPage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyPageImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyPageImpl#getSurveyPageSeqId <em>Survey Page Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyPageImpl#getPageName <em>Page Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyPageImpl#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyPageImpl extends BizEntityImpl implements SurveyPage {
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
	 * The default value of the '{@link #getPageName() <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageName() <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageName()
	 * @generated
	 * @ordered
	 */
	protected String pageName = PAGE_NAME_EDEFAULT;

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
	protected SurveyPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPageName() {
		return pageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageName(String newPageName) {
		String oldPageName = pageName;
		pageName = newPageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_PAGE__PAGE_NAME, oldPageName, pageName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_PAGE__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_PAGE__SURVEY_ID, oldSurveyId, surveyId));
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
		String oldSurveyPageSeqId = surveyPageSeqId;
		surveyPageSeqId = newSurveyPageSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_PAGE__SURVEY_PAGE_SEQ_ID, oldSurveyPageSeqId, surveyPageSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.SURVEY_PAGE__SURVEY_ID:
				return getSurveyId();
			case SurveyPackage.SURVEY_PAGE__SURVEY_PAGE_SEQ_ID:
				return getSurveyPageSeqId();
			case SurveyPackage.SURVEY_PAGE__PAGE_NAME:
				return getPageName();
			case SurveyPackage.SURVEY_PAGE__SEQUENCE_NUM:
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
			case SurveyPackage.SURVEY_PAGE__SURVEY_ID:
				setSurveyId((String)newValue);
				return;
			case SurveyPackage.SURVEY_PAGE__SURVEY_PAGE_SEQ_ID:
				setSurveyPageSeqId((String)newValue);
				return;
			case SurveyPackage.SURVEY_PAGE__PAGE_NAME:
				setPageName((String)newValue);
				return;
			case SurveyPackage.SURVEY_PAGE__SEQUENCE_NUM:
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
			case SurveyPackage.SURVEY_PAGE__SURVEY_ID:
				setSurveyId(SURVEY_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_PAGE__SURVEY_PAGE_SEQ_ID:
				setSurveyPageSeqId(SURVEY_PAGE_SEQ_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_PAGE__PAGE_NAME:
				setPageName(PAGE_NAME_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_PAGE__SEQUENCE_NUM:
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
			case SurveyPackage.SURVEY_PAGE__SURVEY_ID:
				return SURVEY_ID_EDEFAULT == null ? surveyId != null : !SURVEY_ID_EDEFAULT.equals(surveyId);
			case SurveyPackage.SURVEY_PAGE__SURVEY_PAGE_SEQ_ID:
				return SURVEY_PAGE_SEQ_ID_EDEFAULT == null ? surveyPageSeqId != null : !SURVEY_PAGE_SEQ_ID_EDEFAULT.equals(surveyPageSeqId);
			case SurveyPackage.SURVEY_PAGE__PAGE_NAME:
				return PAGE_NAME_EDEFAULT == null ? pageName != null : !PAGE_NAME_EDEFAULT.equals(pageName);
			case SurveyPackage.SURVEY_PAGE__SEQUENCE_NUM:
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
		result.append(", surveyPageSeqId: ");
		result.append(surveyPageSeqId);
		result.append(", pageName: ");
		result.append(pageName);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //SurveyPageImpl
