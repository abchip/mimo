/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getSurveyResponseId <em>Survey Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getGeneralFeedback <em>General Feedback</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getReferenceId <em>Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getResponseDate <em>Response Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getSurveyId <em>Survey Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponse()
 * @model
 * @generated
 */
public interface SurveyResponse extends BizEntity {
	/**
	 * Returns the value of the '<em><b>General Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Feedback</em>' attribute.
	 * @see #setGeneralFeedback(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponse_GeneralFeedback()
	 * @model
	 * @generated
	 */
	String getGeneralFeedback();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getGeneralFeedback <em>General Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Feedback</em>' attribute.
	 * @see #getGeneralFeedback()
	 * @generated
	 */
	void setGeneralFeedback(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponse_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponse_OrderId()
	 * @model annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponse_OrderItemSeqId()
	 * @model
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponse_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Id</em>' attribute.
	 * @see #setReferenceId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponse_ReferenceId()
	 * @model
	 * @generated
	 */
	String getReferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getReferenceId <em>Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Id</em>' attribute.
	 * @see #getReferenceId()
	 * @generated
	 */
	void setReferenceId(String value);

	/**
	 * Returns the value of the '<em><b>Response Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Date</em>' attribute.
	 * @see #setResponseDate(Date)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponse_ResponseDate()
	 * @model
	 * @generated
	 */
	Date getResponseDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getResponseDate <em>Response Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Date</em>' attribute.
	 * @see #getResponseDate()
	 * @generated
	 */
	void setResponseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponse_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

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
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponse_SurveyId()
	 * @model annotation="mimo-ent-domain frame='Survey'"
	 * @generated
	 */
	String getSurveyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getSurveyId <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Id</em>' attribute.
	 * @see #getSurveyId()
	 * @generated
	 */
	void setSurveyId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DataResource' route='surveyResponseId'"
	 * @generated
	 */
	List<String> dataResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='GiftCardFulfillment' route='surveyResponseId'"
	 * @generated
	 */
	List<String> giftCardFulfillments();

	/**
	 * Returns the value of the '<em><b>Survey Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Response Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Response Id</em>' attribute.
	 * @see #setSurveyResponseId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyResponse_SurveyResponseId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSurveyResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyResponse#getSurveyResponseId <em>Survey Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Response Id</em>' attribute.
	 * @see #getSurveyResponseId()
	 * @generated
	 */
	void setSurveyResponseId(String value);

} // SurveyResponse
