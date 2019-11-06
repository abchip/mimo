/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import java.util.List;

import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.SurveyQuestionCategory;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Question Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionCategoryImpl#getSurveyQuestionCategoryId <em>Survey Question Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionCategoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyQuestionCategoryImpl#getParentCategoryId <em>Parent Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyQuestionCategoryImpl extends BizEntityImpl implements SurveyQuestionCategory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getSurveyQuestionCategoryId() <em>Survey Question Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyQuestionCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_QUESTION_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyQuestionCategoryId() <em>Survey Question Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyQuestionCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String surveyQuestionCategoryId = SURVEY_QUESTION_CATEGORY_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getParentCategoryId() <em>Parent Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCategoryId()
	 * @generated
	 * @ordered
	 */
	protected SurveyQuestionCategory parentCategoryId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyQuestionCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY_QUESTION_CATEGORY;
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
	public SurveyQuestionCategory getParentCategoryId() {
		if (parentCategoryId != null && ((EObject)parentCategoryId).eIsProxy()) {
			InternalEObject oldParentCategoryId = (InternalEObject)parentCategoryId;
			parentCategoryId = (SurveyQuestionCategory)eResolveProxy(oldParentCategoryId);
			if (parentCategoryId != oldParentCategoryId) {
			}
		}
		return parentCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyQuestionCategory basicGetParentCategoryId() {
		return parentCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentCategoryId(SurveyQuestionCategory newParentCategoryId) {
		parentCategoryId = newParentCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childSurveyQuestionCategories() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> surveyQuestions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyQuestionCategoryId() {
		return surveyQuestionCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyQuestionCategoryId(String newSurveyQuestionCategoryId) {
		surveyQuestionCategoryId = newSurveyQuestionCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.SURVEY_QUESTION_CATEGORY__SURVEY_QUESTION_CATEGORY_ID:
				return getSurveyQuestionCategoryId();
			case SurveyPackage.SURVEY_QUESTION_CATEGORY__DESCRIPTION:
				return getDescription();
			case SurveyPackage.SURVEY_QUESTION_CATEGORY__PARENT_CATEGORY_ID:
				if (resolve) return getParentCategoryId();
				return basicGetParentCategoryId();
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
			case SurveyPackage.SURVEY_QUESTION_CATEGORY__SURVEY_QUESTION_CATEGORY_ID:
				setSurveyQuestionCategoryId((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_CATEGORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SurveyPackage.SURVEY_QUESTION_CATEGORY__PARENT_CATEGORY_ID:
				setParentCategoryId((SurveyQuestionCategory)newValue);
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
			case SurveyPackage.SURVEY_QUESTION_CATEGORY__SURVEY_QUESTION_CATEGORY_ID:
				setSurveyQuestionCategoryId(SURVEY_QUESTION_CATEGORY_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_CATEGORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_QUESTION_CATEGORY__PARENT_CATEGORY_ID:
				setParentCategoryId((SurveyQuestionCategory)null);
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
			case SurveyPackage.SURVEY_QUESTION_CATEGORY__SURVEY_QUESTION_CATEGORY_ID:
				return SURVEY_QUESTION_CATEGORY_ID_EDEFAULT == null ? surveyQuestionCategoryId != null : !SURVEY_QUESTION_CATEGORY_ID_EDEFAULT.equals(surveyQuestionCategoryId);
			case SurveyPackage.SURVEY_QUESTION_CATEGORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SurveyPackage.SURVEY_QUESTION_CATEGORY__PARENT_CATEGORY_ID:
				return parentCategoryId != null;
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
		result.append(" (surveyQuestionCategoryId: ");
		result.append(surveyQuestionCategoryId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SurveyQuestionCategoryImpl
