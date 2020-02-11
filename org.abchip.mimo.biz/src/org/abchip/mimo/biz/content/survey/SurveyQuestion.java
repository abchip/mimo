/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey;

import java.util.List;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.geo.Geo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getSurveyQuestionId <em>Survey Question Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getEnumTypeId <em>Enum Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getFormatString <em>Format String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getHint <em>Hint</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getSurveyQuestionCategoryId <em>Survey Question Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getSurveyQuestionOptions <em>Survey Question Options</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getSurveyQuestionTypeId <em>Survey Question Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestion()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SurveyQuestion extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestion_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Enum Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Type Id</em>' attribute.
	 * @see #setEnumTypeId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestion_EnumTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getEnumTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getEnumTypeId <em>Enum Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Type Id</em>' attribute.
	 * @see #getEnumTypeId()
	 * @generated
	 */
	void setEnumTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format String</em>' attribute.
	 * @see #setFormatString(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestion_FormatString()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getFormatString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getFormatString <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format String</em>' attribute.
	 * @see #getFormatString()
	 * @generated
	 */
	void setFormatString(String value);

	/**
	 * Returns the value of the '<em><b>Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id</em>' reference.
	 * @see #setGeoId(Geo)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestion_GeoId()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getGeoId <em>Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id</em>' reference.
	 * @see #getGeoId()
	 * @generated
	 */
	void setGeoId(Geo value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' attribute.
	 * @see #setHint(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestion_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestion_Question()
	 * @model
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Survey Question Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Question Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Question Category Id</em>' reference.
	 * @see #setSurveyQuestionCategoryId(SurveyQuestionCategory)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestion_SurveyQuestionCategoryId()
	 * @model keys="surveyQuestionCategoryId"
	 * @generated
	 */
	SurveyQuestionCategory getSurveyQuestionCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getSurveyQuestionCategoryId <em>Survey Question Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Question Category Id</em>' reference.
	 * @see #getSurveyQuestionCategoryId()
	 * @generated
	 */
	void setSurveyQuestionCategoryId(SurveyQuestionCategory value);

	/**
	 * Returns the value of the '<em><b>Survey Question Options</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.content.survey.SurveyQuestionOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Question Options</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Question Options</em>' reference list.
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestion_SurveyQuestionOptions()
	 * @model derived="true"
	 * @generated
	 */
	List<SurveyQuestionOption> getSurveyQuestionOptions();

	/**
	 * Returns the value of the '<em><b>Survey Question Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Question Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Question Id</em>' attribute.
	 * @see #setSurveyQuestionId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestion_SurveyQuestionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyQuestionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getSurveyQuestionId <em>Survey Question Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Question Id</em>' attribute.
	 * @see #getSurveyQuestionId()
	 * @generated
	 */
	void setSurveyQuestionId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Question Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Question Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Question Type Id</em>' reference.
	 * @see #setSurveyQuestionTypeId(SurveyQuestionType)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestion_SurveyQuestionTypeId()
	 * @model keys="surveyQuestionTypeId"
	 * @generated
	 */
	SurveyQuestionType getSurveyQuestionTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestion#getSurveyQuestionTypeId <em>Survey Question Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Question Type Id</em>' reference.
	 * @see #getSurveyQuestionTypeId()
	 * @generated
	 */
	void setSurveyQuestionTypeId(SurveyQuestionType value);

} // SurveyQuestion
