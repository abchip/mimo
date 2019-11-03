/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityTrckCode;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Opportunity Trck Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl#getTrackingCodeId <em>Tracking Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl#getReceivedDate <em>Received Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesOpportunityTrckCodeImpl extends BizEntityImpl implements SalesOpportunityTrckCode {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSalesOpportunityId() <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityId()
	 * @generated
	 * @ordered
	 */
	protected static final String SALES_OPPORTUNITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalesOpportunityId() <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityId()
	 * @generated
	 * @ordered
	 */
	protected String salesOpportunityId = SALES_OPPORTUNITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrackingCodeId() <em>Tracking Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingCodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACKING_CODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrackingCodeId() <em>Tracking Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingCodeId()
	 * @generated
	 * @ordered
	 */
	protected String trackingCodeId = TRACKING_CODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceivedDate() <em>Received Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECEIVED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivedDate() <em>Received Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedDate()
	 * @generated
	 * @ordered
	 */
	protected Date receivedDate = RECEIVED_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesOpportunityTrckCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_OPPORTUNITY_TRCK_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReceivedDate() {
		return receivedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceivedDate(Date newReceivedDate) {
		Date oldReceivedDate = receivedDate;
		receivedDate = newReceivedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE, oldReceivedDate, receivedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalesOpportunityId() {
		return salesOpportunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunityId(String newSalesOpportunityId) {
		String oldSalesOpportunityId = salesOpportunityId;
		salesOpportunityId = newSalesOpportunityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY_ID, oldSalesOpportunityId, salesOpportunityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingCodeId() {
		return trackingCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCodeId(String newTrackingCodeId) {
		String oldTrackingCodeId = trackingCodeId;
		trackingCodeId = newTrackingCodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID, oldTrackingCodeId, trackingCodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY_ID:
				return getSalesOpportunityId();
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID:
				return getTrackingCodeId();
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE:
				return getReceivedDate();
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
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID:
				setTrackingCodeId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE:
				setReceivedDate((Date)newValue);
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
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId(SALES_OPPORTUNITY_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID:
				setTrackingCodeId(TRACKING_CODE_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE:
				setReceivedDate(RECEIVED_DATE_EDEFAULT);
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
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY_ID:
				return SALES_OPPORTUNITY_ID_EDEFAULT == null ? salesOpportunityId != null : !SALES_OPPORTUNITY_ID_EDEFAULT.equals(salesOpportunityId);
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID:
				return TRACKING_CODE_ID_EDEFAULT == null ? trackingCodeId != null : !TRACKING_CODE_ID_EDEFAULT.equals(trackingCodeId);
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE:
				return RECEIVED_DATE_EDEFAULT == null ? receivedDate != null : !RECEIVED_DATE_EDEFAULT.equals(receivedDate);
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
		result.append(" (salesOpportunityId: ");
		result.append(salesOpportunityId);
		result.append(", trackingCodeId: ");
		result.append(trackingCodeId);
		result.append(", receivedDate: ");
		result.append(receivedDate);
		result.append(')');
		return result.toString();
	}

} //SalesOpportunityTrckCodeImpl
