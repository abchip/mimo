/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import org.abchip.mimo.biz.content.survey.SurveyMultiResp;
import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Multi Resp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyMultiRespImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyMultiRespImpl#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyMultiRespImpl#getMultiRespTitle <em>Multi Resp Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyMultiRespImpl extends BizEntityImpl implements SurveyMultiResp {
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
	 * The default value of the '{@link #getMultiRespTitle() <em>Multi Resp Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiRespTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTI_RESP_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiRespTitle() <em>Multi Resp Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiRespTitle()
	 * @generated
	 * @ordered
	 */
	protected String multiRespTitle = MULTI_RESP_TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyMultiRespImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY_MULTI_RESP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultiRespTitle() {
		return multiRespTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiRespTitle(String newMultiRespTitle) {
		String oldMultiRespTitle = multiRespTitle;
		multiRespTitle = newMultiRespTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_MULTI_RESP__MULTI_RESP_TITLE, oldMultiRespTitle, multiRespTitle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_MULTI_RESP__SURVEY_ID, oldSurveyId, surveyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_MULTI_RESP__SURVEY_MULTI_RESP_ID, oldSurveyMultiRespId, surveyMultiRespId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.SURVEY_MULTI_RESP__SURVEY_ID:
				return getSurveyId();
			case SurveyPackage.SURVEY_MULTI_RESP__SURVEY_MULTI_RESP_ID:
				return getSurveyMultiRespId();
			case SurveyPackage.SURVEY_MULTI_RESP__MULTI_RESP_TITLE:
				return getMultiRespTitle();
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
			case SurveyPackage.SURVEY_MULTI_RESP__SURVEY_ID:
				setSurveyId((String)newValue);
				return;
			case SurveyPackage.SURVEY_MULTI_RESP__SURVEY_MULTI_RESP_ID:
				setSurveyMultiRespId((String)newValue);
				return;
			case SurveyPackage.SURVEY_MULTI_RESP__MULTI_RESP_TITLE:
				setMultiRespTitle((String)newValue);
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
			case SurveyPackage.SURVEY_MULTI_RESP__SURVEY_ID:
				setSurveyId(SURVEY_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_MULTI_RESP__SURVEY_MULTI_RESP_ID:
				setSurveyMultiRespId(SURVEY_MULTI_RESP_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_MULTI_RESP__MULTI_RESP_TITLE:
				setMultiRespTitle(MULTI_RESP_TITLE_EDEFAULT);
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
			case SurveyPackage.SURVEY_MULTI_RESP__SURVEY_ID:
				return SURVEY_ID_EDEFAULT == null ? surveyId != null : !SURVEY_ID_EDEFAULT.equals(surveyId);
			case SurveyPackage.SURVEY_MULTI_RESP__SURVEY_MULTI_RESP_ID:
				return SURVEY_MULTI_RESP_ID_EDEFAULT == null ? surveyMultiRespId != null : !SURVEY_MULTI_RESP_ID_EDEFAULT.equals(surveyMultiRespId);
			case SurveyPackage.SURVEY_MULTI_RESP__MULTI_RESP_TITLE:
				return MULTI_RESP_TITLE_EDEFAULT == null ? multiRespTitle != null : !MULTI_RESP_TITLE_EDEFAULT.equals(multiRespTitle);
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
		result.append(", multiRespTitle: ");
		result.append(multiRespTitle);
		result.append(')');
		return result.toString();
	}

} //SurveyMultiRespImpl
