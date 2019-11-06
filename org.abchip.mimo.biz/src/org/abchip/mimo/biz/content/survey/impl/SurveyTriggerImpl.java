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
import org.abchip.mimo.biz.content.survey.SurveyApplType;
import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.SurveyTrigger;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyTriggerImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyTriggerImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyTriggerImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyTriggerImpl#getSurveyApplTypeId <em>Survey Appl Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyTriggerImpl extends BizEntityImpl implements SurveyTrigger {
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
	 * The cached value of the '{@link #getSurveyId() <em>Survey Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyId()
	 * @generated
	 * @ordered
	 */
	protected Survey surveyId;

	/**
	 * The cached value of the '{@link #getSurveyApplTypeId() <em>Survey Appl Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyApplTypeId()
	 * @generated
	 * @ordered
	 */
	protected SurveyApplType surveyApplTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY_TRIGGER;
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
	public SurveyApplType getSurveyApplTypeId() {
		if (surveyApplTypeId != null && ((EObject)surveyApplTypeId).eIsProxy()) {
			InternalEObject oldSurveyApplTypeId = (InternalEObject)surveyApplTypeId;
			surveyApplTypeId = (SurveyApplType)eResolveProxy(oldSurveyApplTypeId);
			if (surveyApplTypeId != oldSurveyApplTypeId) {
			}
		}
		return surveyApplTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyApplType basicGetSurveyApplTypeId() {
		return surveyApplTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyApplTypeId(SurveyApplType newSurveyApplTypeId) {
		surveyApplTypeId = newSurveyApplTypeId;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.SURVEY_TRIGGER__FROM_DATE:
				return getFromDate();
			case SurveyPackage.SURVEY_TRIGGER__THRU_DATE:
				return getThruDate();
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_ID:
				if (resolve) return getSurveyId();
				return basicGetSurveyId();
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_APPL_TYPE_ID:
				if (resolve) return getSurveyApplTypeId();
				return basicGetSurveyApplTypeId();
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
			case SurveyPackage.SURVEY_TRIGGER__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case SurveyPackage.SURVEY_TRIGGER__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_ID:
				setSurveyId((Survey)newValue);
				return;
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_APPL_TYPE_ID:
				setSurveyApplTypeId((SurveyApplType)newValue);
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
			case SurveyPackage.SURVEY_TRIGGER__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_TRIGGER__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_ID:
				setSurveyId((Survey)null);
				return;
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_APPL_TYPE_ID:
				setSurveyApplTypeId((SurveyApplType)null);
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
			case SurveyPackage.SURVEY_TRIGGER__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case SurveyPackage.SURVEY_TRIGGER__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_ID:
				return surveyId != null;
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_APPL_TYPE_ID:
				return surveyApplTypeId != null;
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
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //SurveyTriggerImpl
