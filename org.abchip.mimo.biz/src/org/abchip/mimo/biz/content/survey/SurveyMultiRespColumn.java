/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Multi Resp Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn#getColumnTitle <em>Column Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyMultiRespColumn()
 * @model annotation="mimo-ent-frame title='Survey Multi-Response Group Column/Category'"
 * @generated
 */
public interface SurveyMultiRespColumn extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Column Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Title</em>' attribute.
	 * @see #setColumnTitle(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyMultiRespColumn_ColumnTitle()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getColumnTitle();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn#getColumnTitle <em>Column Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Title</em>' attribute.
	 * @see #getColumnTitle()
	 * @generated
	 */
	void setColumnTitle(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyMultiRespColumn_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

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
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyMultiRespColumn_SurveyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn#getSurveyId <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Id</em>' attribute.
	 * @see #getSurveyId()
	 * @generated
	 */
	void setSurveyId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Multi Resp Col Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Multi Resp Col Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Multi Resp Col Id</em>' attribute.
	 * @see #setSurveyMultiRespColId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyMultiRespColumn_SurveyMultiRespColId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyMultiRespColId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Multi Resp Col Id</em>' attribute.
	 * @see #getSurveyMultiRespColId()
	 * @generated
	 */
	void setSurveyMultiRespColId(String value);

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
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyMultiRespColumn_SurveyMultiRespId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyMultiRespId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Multi Resp Id</em>' attribute.
	 * @see #getSurveyMultiRespId()
	 * @generated
	 */
	void setSurveyMultiRespId(String value);

} // SurveyMultiRespColumn
