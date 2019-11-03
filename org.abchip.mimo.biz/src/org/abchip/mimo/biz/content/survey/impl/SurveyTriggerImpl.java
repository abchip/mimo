/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import java.util.Date;

import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.SurveyTrigger;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyTriggerImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyTriggerImpl#getSurveyApplTypeId <em>Survey Appl Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyTriggerImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyTriggerImpl#getThruDate <em>Thru Date</em>}</li>
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
	 * The default value of the '{@link #getSurveyApplTypeId() <em>Survey Appl Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyApplTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_APPL_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyApplTypeId() <em>Survey Appl Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyApplTypeId()
	 * @generated
	 * @ordered
	 */
	protected String surveyApplTypeId = SURVEY_APPL_TYPE_ID_EDEFAULT;

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
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_TRIGGER__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyApplTypeId() {
		return surveyApplTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyApplTypeId(String newSurveyApplTypeId) {
		String oldSurveyApplTypeId = surveyApplTypeId;
		surveyApplTypeId = newSurveyApplTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_TRIGGER__SURVEY_APPL_TYPE_ID, oldSurveyApplTypeId, surveyApplTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_TRIGGER__SURVEY_ID, oldSurveyId, surveyId));
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
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_TRIGGER__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_ID:
				return getSurveyId();
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_APPL_TYPE_ID:
				return getSurveyApplTypeId();
			case SurveyPackage.SURVEY_TRIGGER__FROM_DATE:
				return getFromDate();
			case SurveyPackage.SURVEY_TRIGGER__THRU_DATE:
				return getThruDate();
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
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_ID:
				setSurveyId((String)newValue);
				return;
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_APPL_TYPE_ID:
				setSurveyApplTypeId((String)newValue);
				return;
			case SurveyPackage.SURVEY_TRIGGER__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case SurveyPackage.SURVEY_TRIGGER__THRU_DATE:
				setThruDate((Date)newValue);
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
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_ID:
				setSurveyId(SURVEY_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_APPL_TYPE_ID:
				setSurveyApplTypeId(SURVEY_APPL_TYPE_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_TRIGGER__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_TRIGGER__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_ID:
				return SURVEY_ID_EDEFAULT == null ? surveyId != null : !SURVEY_ID_EDEFAULT.equals(surveyId);
			case SurveyPackage.SURVEY_TRIGGER__SURVEY_APPL_TYPE_ID:
				return SURVEY_APPL_TYPE_ID_EDEFAULT == null ? surveyApplTypeId != null : !SURVEY_APPL_TYPE_ID_EDEFAULT.equals(surveyApplTypeId);
			case SurveyPackage.SURVEY_TRIGGER__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case SurveyPackage.SURVEY_TRIGGER__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(", surveyApplTypeId: ");
		result.append(surveyApplTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //SurveyTriggerImpl
