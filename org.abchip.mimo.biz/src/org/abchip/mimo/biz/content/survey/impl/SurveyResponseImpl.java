/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.SurveyResponse;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getSurveyResponseId <em>Survey Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getGeneralFeedback <em>General Feedback</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getReferenceId <em>Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getResponseDate <em>Response Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getSurveyId <em>Survey Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyResponseImpl extends BizEntityImpl implements SurveyResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getSurveyResponseId() <em>Survey Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyResponseId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_RESPONSE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyResponseId() <em>Survey Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyResponseId()
	 * @generated
	 * @ordered
	 */
	protected String surveyResponseId = SURVEY_RESPONSE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneralFeedback() <em>General Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERAL_FEEDBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneralFeedback() <em>General Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralFeedback()
	 * @generated
	 * @ordered
	 */
	protected String generalFeedback = GENERAL_FEEDBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemSeqId = ORDER_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceId() <em>Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceId() <em>Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceId()
	 * @generated
	 * @ordered
	 */
	protected String referenceId = REFERENCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseDate() <em>Response Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESPONSE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseDate() <em>Response Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseDate()
	 * @generated
	 * @ordered
	 */
	protected Date responseDate = RESPONSE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneralFeedback() {
		return generalFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneralFeedback(String newGeneralFeedback) {
		String oldGeneralFeedback = generalFeedback;
		generalFeedback = newGeneralFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_RESPONSE__GENERAL_FEEDBACK, oldGeneralFeedback, generalFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		Date oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_RESPONSE__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_RESPONSE__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return orderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		String oldOrderItemSeqId = orderItemSeqId;
		orderItemSeqId = newOrderItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_RESPONSE__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_RESPONSE__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferenceId() {
		return referenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceId(String newReferenceId) {
		String oldReferenceId = referenceId;
		referenceId = newReferenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_RESPONSE__REFERENCE_ID, oldReferenceId, referenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getResponseDate() {
		return responseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseDate(Date newResponseDate) {
		Date oldResponseDate = responseDate;
		responseDate = newResponseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_RESPONSE__RESPONSE_DATE, oldResponseDate, responseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_RESPONSE__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_RESPONSE__SURVEY_ID, oldSurveyId, surveyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> dataResources() {
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
	public List<String> giftCardFulfillments() {
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
	public String getSurveyResponseId() {
		return surveyResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyResponseId(String newSurveyResponseId) {
		String oldSurveyResponseId = surveyResponseId;
		surveyResponseId = newSurveyResponseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY_RESPONSE__SURVEY_RESPONSE_ID, oldSurveyResponseId, surveyResponseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.SURVEY_RESPONSE__SURVEY_RESPONSE_ID:
				return getSurveyResponseId();
			case SurveyPackage.SURVEY_RESPONSE__GENERAL_FEEDBACK:
				return getGeneralFeedback();
			case SurveyPackage.SURVEY_RESPONSE__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ID:
				return getOrderId();
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case SurveyPackage.SURVEY_RESPONSE__PARTY_ID:
				return getPartyId();
			case SurveyPackage.SURVEY_RESPONSE__REFERENCE_ID:
				return getReferenceId();
			case SurveyPackage.SURVEY_RESPONSE__RESPONSE_DATE:
				return getResponseDate();
			case SurveyPackage.SURVEY_RESPONSE__STATUS_ID:
				return getStatusId();
			case SurveyPackage.SURVEY_RESPONSE__SURVEY_ID:
				return getSurveyId();
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
			case SurveyPackage.SURVEY_RESPONSE__SURVEY_RESPONSE_ID:
				setSurveyResponseId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__GENERAL_FEEDBACK:
				setGeneralFeedback((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__REFERENCE_ID:
				setReferenceId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__RESPONSE_DATE:
				setResponseDate((Date)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__SURVEY_ID:
				setSurveyId((String)newValue);
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
			case SurveyPackage.SURVEY_RESPONSE__SURVEY_RESPONSE_ID:
				setSurveyResponseId(SURVEY_RESPONSE_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE__GENERAL_FEEDBACK:
				setGeneralFeedback(GENERAL_FEEDBACK_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE__REFERENCE_ID:
				setReferenceId(REFERENCE_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE__RESPONSE_DATE:
				setResponseDate(RESPONSE_DATE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE__SURVEY_ID:
				setSurveyId(SURVEY_ID_EDEFAULT);
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
			case SurveyPackage.SURVEY_RESPONSE__SURVEY_RESPONSE_ID:
				return SURVEY_RESPONSE_ID_EDEFAULT == null ? surveyResponseId != null : !SURVEY_RESPONSE_ID_EDEFAULT.equals(surveyResponseId);
			case SurveyPackage.SURVEY_RESPONSE__GENERAL_FEEDBACK:
				return GENERAL_FEEDBACK_EDEFAULT == null ? generalFeedback != null : !GENERAL_FEEDBACK_EDEFAULT.equals(generalFeedback);
			case SurveyPackage.SURVEY_RESPONSE__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case SurveyPackage.SURVEY_RESPONSE__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case SurveyPackage.SURVEY_RESPONSE__REFERENCE_ID:
				return REFERENCE_ID_EDEFAULT == null ? referenceId != null : !REFERENCE_ID_EDEFAULT.equals(referenceId);
			case SurveyPackage.SURVEY_RESPONSE__RESPONSE_DATE:
				return RESPONSE_DATE_EDEFAULT == null ? responseDate != null : !RESPONSE_DATE_EDEFAULT.equals(responseDate);
			case SurveyPackage.SURVEY_RESPONSE__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case SurveyPackage.SURVEY_RESPONSE__SURVEY_ID:
				return SURVEY_ID_EDEFAULT == null ? surveyId != null : !SURVEY_ID_EDEFAULT.equals(surveyId);
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
		result.append(" (surveyResponseId: ");
		result.append(surveyResponseId);
		result.append(", generalFeedback: ");
		result.append(generalFeedback);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", referenceId: ");
		result.append(referenceId);
		result.append(", responseDate: ");
		result.append(responseDate);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", surveyId: ");
		result.append(surveyId);
		result.append(')');
		return result.toString();
	}

} //SurveyResponseImpl
