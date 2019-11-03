/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Multi Resp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyMultiResp#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyMultiResp#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyMultiResp#getMultiRespTitle <em>Multi Resp Title</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyMultiResp()
 * @model
 * @generated
 */
public interface SurveyMultiResp extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Multi Resp Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Resp Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Resp Title</em>' attribute.
	 * @see #setMultiRespTitle(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyMultiResp_MultiRespTitle()
	 * @model
	 * @generated
	 */
	String getMultiRespTitle();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyMultiResp#getMultiRespTitle <em>Multi Resp Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Resp Title</em>' attribute.
	 * @see #getMultiRespTitle()
	 * @generated
	 */
	void setMultiRespTitle(String value);

	/**
	 * Returns the value of the '<em><b>Survey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Id</em>' attribute.
	 * @see #setSurveyId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyMultiResp_SurveyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Survey'"
	 * @generated
	 */
	String getSurveyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyMultiResp#getSurveyId <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Id</em>' attribute.
	 * @see #getSurveyId()
	 * @generated
	 */
	void setSurveyId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Multi Resp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Multi Resp Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Multi Resp Id</em>' attribute.
	 * @see #setSurveyMultiRespId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyMultiResp_SurveyMultiRespId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSurveyMultiRespId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyMultiResp#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Multi Resp Id</em>' attribute.
	 * @see #getSurveyMultiRespId()
	 * @generated
	 */
	void setSurveyMultiRespId(String value);

} // SurveyMultiResp
