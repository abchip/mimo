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

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.content.survey.Survey;
import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.SurveyResponse;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getReferenceId <em>Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getResponseDate <em>Response Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyResponseImpl#getStatusId <em>Status Id</em>}</li>
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
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader orderId;

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
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

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
	public OrderHeader getOrderId() {
		if (orderId != null && ((EObject)orderId).eIsProxy()) {
			InternalEObject oldOrderId = (InternalEObject)orderId;
			orderId = (OrderHeader)eResolveProxy(oldOrderId);
			if (orderId != oldOrderId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SurveyPackage.SURVEY_RESPONSE__ORDER_ID, oldOrderId, orderId));
			}
		}
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		OrderHeader oldOrderId = orderId;
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
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SurveyPackage.SURVEY_RESPONSE__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
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
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SurveyPackage.SURVEY_RESPONSE__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
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
	public Survey getSurveyId() {
		if (surveyId != null && ((EObject)surveyId).eIsProxy()) {
			InternalEObject oldSurveyId = (InternalEObject)surveyId;
			surveyId = (Survey)eResolveProxy(oldSurveyId);
			if (surveyId != oldSurveyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SurveyPackage.SURVEY_RESPONSE__SURVEY_ID, oldSurveyId, surveyId));
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
		Survey oldSurveyId = surveyId;
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
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case SurveyPackage.SURVEY_RESPONSE__REFERENCE_ID:
				return getReferenceId();
			case SurveyPackage.SURVEY_RESPONSE__RESPONSE_DATE:
				return getResponseDate();
			case SurveyPackage.SURVEY_RESPONSE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case SurveyPackage.SURVEY_RESPONSE__SURVEY_ID:
				if (resolve) return getSurveyId();
				return basicGetSurveyId();
			case SurveyPackage.SURVEY_RESPONSE__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
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
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__REFERENCE_ID:
				setReferenceId((String)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__RESPONSE_DATE:
				setResponseDate((Date)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__SURVEY_ID:
				setSurveyId((Survey)newValue);
				return;
			case SurveyPackage.SURVEY_RESPONSE__STATUS_ID:
				setStatusId((StatusItem)newValue);
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
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE__REFERENCE_ID:
				setReferenceId(REFERENCE_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE__RESPONSE_DATE:
				setResponseDate(RESPONSE_DATE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY_RESPONSE__PARTY_ID:
				setPartyId((Party)null);
				return;
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case SurveyPackage.SURVEY_RESPONSE__SURVEY_ID:
				setSurveyId((Survey)null);
				return;
			case SurveyPackage.SURVEY_RESPONSE__STATUS_ID:
				setStatusId((StatusItem)null);
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
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case SurveyPackage.SURVEY_RESPONSE__REFERENCE_ID:
				return REFERENCE_ID_EDEFAULT == null ? referenceId != null : !REFERENCE_ID_EDEFAULT.equals(referenceId);
			case SurveyPackage.SURVEY_RESPONSE__RESPONSE_DATE:
				return RESPONSE_DATE_EDEFAULT == null ? responseDate != null : !RESPONSE_DATE_EDEFAULT.equals(responseDate);
			case SurveyPackage.SURVEY_RESPONSE__PARTY_ID:
				return partyId != null;
			case SurveyPackage.SURVEY_RESPONSE__ORDER_ID:
				return orderId != null;
			case SurveyPackage.SURVEY_RESPONSE__SURVEY_ID:
				return surveyId != null;
			case SurveyPackage.SURVEY_RESPONSE__STATUS_ID:
				return statusId != null;
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
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", referenceId: ");
		result.append(referenceId);
		result.append(", responseDate: ");
		result.append(responseDate);
		result.append(')');
		return result.toString();
	}

} //SurveyResponseImpl
