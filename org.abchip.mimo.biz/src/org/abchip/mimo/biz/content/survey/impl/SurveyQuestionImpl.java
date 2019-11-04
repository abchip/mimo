/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.SurveyQuestion;
import org.abchip.mimo.biz.content.survey.SurveyQuestionCategory;
import org.abchip.mimo.biz.content.survey.SurveyQuestionType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionImpl#getSurveyQuestionId <em>Survey Question Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionImpl#getEnumTypeId <em>Enum Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionImpl#getFormatString <em>Format String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionImpl#getSurveyQuestionTypeId <em>Survey Question Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionImpl#getSurveyQuestionCategoryId <em>Survey Question Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionImpl#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionImpl#getSurveyQuestionOptions <em>Survey Question Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyQuestionImpl extends BizEntityTypedImpl<SurveyQuestionType> implements SurveyQuestion {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getSurveyQuestionId() <em>Survey Question Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyQuestionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_QUESTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyQuestionId() <em>Survey Question Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyQuestionId()
	 * @generated
	 * @ordered
	 */
	protected String surveyQuestionId = SURVEY_QUESTION_ID_EDEFAULT;

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
	 * The default value of the '{@link #getEnumTypeId() <em>Enum Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ENUM_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnumTypeId() <em>Enum Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumTypeId()
	 * @generated
	 * @ordered
	 */
	protected String enumTypeId = ENUM_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatString()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatString()
	 * @generated
	 * @ordered
	 */
	protected String formatString = FORMAT_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getHint() <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected static final String HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHint() <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected String hint = HINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected String question = QUESTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSurveyQuestionTypeId() <em>Survey Question Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyQuestionTypeId()
	 * @generated
	 * @ordered
	 */
	protected SurveyQuestionType surveyQuestionTypeId;

	/**
	 * The cached value of the '{@link #getSurveyQuestionCategoryId() <em>Survey Question Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyQuestionCategoryId()
	 * @generated
	 * @ordered
	 */
	protected SurveyQuestionCategory surveyQuestionCategoryId;

	/**
	 * The cached value of the '{@link #getGeoId() <em>Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo geoId;

	/**
	 * The cached value of the '{@link #getSurveyQuestionOptions() <em>Survey Question Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyQuestionOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> surveyQuestionOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY_QUESTION;
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_QUESTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnumTypeId() {
		return enumTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumTypeId(String newEnumTypeId) {
		String oldEnumTypeId = enumTypeId;
		enumTypeId = newEnumTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_QUESTION__ENUM_TYPE_ID, oldEnumTypeId, enumTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormatString() {
		return formatString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormatString(String newFormatString) {
		String oldFormatString = formatString;
		formatString = newFormatString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_QUESTION__FORMAT_STRING, oldFormatString, formatString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoId() {
		if (geoId != null && ((EObject)geoId).eIsProxy()) {
			InternalEObject oldGeoId = (InternalEObject)geoId;
			geoId = (Geo)eResolveProxy(oldGeoId);
			if (geoId != oldGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SurveyPackage.SURVEY_QUESTION__GEO_ID, oldGeoId, geoId));
			}
		}
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetGeoId() {
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(Geo newGeoId) {
		Geo oldGeoId = geoId;
		geoId = newGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_QUESTION__GEO_ID, oldGeoId, geoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHint() {
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHint(String newHint) {
		String oldHint = hint;
		hint = newHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_QUESTION__HINT, oldHint, hint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestion(String newQuestion) {
		String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_QUESTION__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyQuestionCategory getSurveyQuestionCategoryId() {
		if (surveyQuestionCategoryId != null && ((EObject)surveyQuestionCategoryId).eIsProxy()) {
			InternalEObject oldSurveyQuestionCategoryId = (InternalEObject)surveyQuestionCategoryId;
			surveyQuestionCategoryId = (SurveyQuestionCategory)eResolveProxy(oldSurveyQuestionCategoryId);
			if (surveyQuestionCategoryId != oldSurveyQuestionCategoryId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_CATEGORY_ID, oldSurveyQuestionCategoryId, surveyQuestionCategoryId));
			}
		}
		return surveyQuestionCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyQuestionCategory basicGetSurveyQuestionCategoryId() {
		return surveyQuestionCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyQuestionCategoryId(SurveyQuestionCategory newSurveyQuestionCategoryId) {
		SurveyQuestionCategory oldSurveyQuestionCategoryId = surveyQuestionCategoryId;
		surveyQuestionCategoryId = newSurveyQuestionCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_CATEGORY_ID, oldSurveyQuestionCategoryId, surveyQuestionCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyQuestionId() {
		return surveyQuestionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyQuestionId(String newSurveyQuestionId) {
		String oldSurveyQuestionId = surveyQuestionId;
		surveyQuestionId = newSurveyQuestionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_ID, oldSurveyQuestionId, surveyQuestionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyQuestionType getSurveyQuestionTypeId() {
		if (surveyQuestionTypeId != null && ((EObject)surveyQuestionTypeId).eIsProxy()) {
			InternalEObject oldSurveyQuestionTypeId = (InternalEObject)surveyQuestionTypeId;
			surveyQuestionTypeId = (SurveyQuestionType)eResolveProxy(oldSurveyQuestionTypeId);
			if (surveyQuestionTypeId != oldSurveyQuestionTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_TYPE_ID, oldSurveyQuestionTypeId, surveyQuestionTypeId));
			}
		}
		return surveyQuestionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyQuestionType basicGetSurveyQuestionTypeId() {
		return surveyQuestionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyQuestionTypeId(SurveyQuestionType newSurveyQuestionTypeId) {
		SurveyQuestionType oldSurveyQuestionTypeId = surveyQuestionTypeId;
		surveyQuestionTypeId = newSurveyQuestionTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_TYPE_ID, oldSurveyQuestionTypeId, surveyQuestionTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSurveyQuestionOptions() {
		if (surveyQuestionOptions == null) {
			surveyQuestionOptions = new EDataTypeUniqueEList<String>(String.class, this, SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_OPTIONS);
		}
		return surveyQuestionOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_ID:
				return getSurveyQuestionId();
			case SurveyPackage.SURVEY_QUESTION__DESCRIPTION:
				return getDescription();
			case SurveyPackage.SURVEY_QUESTION__ENUM_TYPE_ID:
				return getEnumTypeId();
			case SurveyPackage.SURVEY_QUESTION__FORMAT_STRING:
				return getFormatString();
			case SurveyPackage.SURVEY_QUESTION__HINT:
				return getHint();
			case SurveyPackage.SURVEY_QUESTION__QUESTION:
				return getQuestion();
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_TYPE_ID:
				if (resolve) return getSurveyQuestionTypeId();
				return basicGetSurveyQuestionTypeId();
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_CATEGORY_ID:
				if (resolve) return getSurveyQuestionCategoryId();
				return basicGetSurveyQuestionCategoryId();
			case SurveyPackage.SURVEY_QUESTION__GEO_ID:
				if (resolve) return getGeoId();
				return basicGetGeoId();
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_OPTIONS:
				return getSurveyQuestionOptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_ID:
				setSurveyQuestionId((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION__ENUM_TYPE_ID:
				setEnumTypeId((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION__FORMAT_STRING:
				setFormatString((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION__HINT:
				setHint((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION__QUESTION:
				setQuestion((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_TYPE_ID:
				setSurveyQuestionTypeId((SurveyQuestionType)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_CATEGORY_ID:
				setSurveyQuestionCategoryId((SurveyQuestionCategory)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION__GEO_ID:
				setGeoId((Geo)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_OPTIONS:
				getSurveyQuestionOptions().clear();
				getSurveyQuestionOptions().addAll((Collection<? extends String>)newValue);
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
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_ID:
				setSurveyQuestionId(SURVEY_QUESTION_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION__ENUM_TYPE_ID:
				setEnumTypeId(ENUM_TYPE_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION__FORMAT_STRING:
				setFormatString(FORMAT_STRING_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION__HINT:
				setHint(HINT_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_TYPE_ID:
				setSurveyQuestionTypeId((SurveyQuestionType)null);
				return;
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_CATEGORY_ID:
				setSurveyQuestionCategoryId((SurveyQuestionCategory)null);
				return;
			case SurveyPackage.SURVEY_QUESTION__GEO_ID:
				setGeoId((Geo)null);
				return;
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_OPTIONS:
				getSurveyQuestionOptions().clear();
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
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_ID:
				return SURVEY_QUESTION_ID_EDEFAULT == null ? surveyQuestionId != null : !SURVEY_QUESTION_ID_EDEFAULT.equals(surveyQuestionId);
			case SurveyPackage.SURVEY_QUESTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SurveyPackage.SURVEY_QUESTION__ENUM_TYPE_ID:
				return ENUM_TYPE_ID_EDEFAULT == null ? enumTypeId != null : !ENUM_TYPE_ID_EDEFAULT.equals(enumTypeId);
			case SurveyPackage.SURVEY_QUESTION__FORMAT_STRING:
				return FORMAT_STRING_EDEFAULT == null ? formatString != null : !FORMAT_STRING_EDEFAULT.equals(formatString);
			case SurveyPackage.SURVEY_QUESTION__HINT:
				return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
			case SurveyPackage.SURVEY_QUESTION__QUESTION:
				return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_TYPE_ID:
				return surveyQuestionTypeId != null;
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_CATEGORY_ID:
				return surveyQuestionCategoryId != null;
			case SurveyPackage.SURVEY_QUESTION__GEO_ID:
				return geoId != null;
			case SurveyPackage.SURVEY_QUESTION__SURVEY_QUESTION_OPTIONS:
				return surveyQuestionOptions != null && !surveyQuestionOptions.isEmpty();
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
		result.append(" (surveyQuestionId: ");
		result.append(surveyQuestionId);
		result.append(", description: ");
		result.append(description);
		result.append(", enumTypeId: ");
		result.append(enumTypeId);
		result.append(", formatString: ");
		result.append(formatString);
		result.append(", hint: ");
		result.append(hint);
		result.append(", question: ");
		result.append(question);
		result.append(", surveyQuestionOptions: ");
		result.append(surveyQuestionOptions);
		result.append(')');
		return result.toString();
	}

} //SurveyQuestionImpl
