/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.request.CustRequestStatus;
import org.abchip.mimo.biz.order.request.RequestPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cust Request Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestStatusImpl#getCustRequestStatusId <em>Cust Request Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestStatusImpl#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestStatusImpl#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestStatusImpl#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestStatusImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestStatusImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustRequestStatusImpl extends BizEntityImpl implements CustRequestStatus {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getCustRequestStatusId() <em>Cust Request Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUST_REQUEST_STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustRequestStatusId() <em>Cust Request Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestStatusId()
	 * @generated
	 * @ordered
	 */
	protected String custRequestStatusId = CUST_REQUEST_STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeByUserLoginId() <em>Change By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_BY_USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeByUserLoginId() <em>Change By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String changeByUserLoginId = CHANGE_BY_USER_LOGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustRequestId() <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUST_REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustRequestId() <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestId()
	 * @generated
	 * @ordered
	 */
	protected String custRequestId = CUST_REQUEST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustRequestItemSeqId() <em>Cust Request Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustRequestItemSeqId() <em>Cust Request Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String custRequestItemSeqId = CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STATUS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected Date statusDate = STATUS_DATE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustRequestStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.CUST_REQUEST_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangeByUserLoginId() {
		return changeByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeByUserLoginId(String newChangeByUserLoginId) {
		String oldChangeByUserLoginId = changeByUserLoginId;
		changeByUserLoginId = newChangeByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_STATUS__CHANGE_BY_USER_LOGIN_ID, oldChangeByUserLoginId, changeByUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestId() {
		return custRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestId(String newCustRequestId) {
		String oldCustRequestId = custRequestId;
		custRequestId = newCustRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_ID, oldCustRequestId, custRequestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestItemSeqId() {
		return custRequestItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestItemSeqId(String newCustRequestItemSeqId) {
		String oldCustRequestItemSeqId = custRequestItemSeqId;
		custRequestItemSeqId = newCustRequestItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_ITEM_SEQ_ID, oldCustRequestItemSeqId, custRequestItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestStatusId() {
		return custRequestStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestStatusId(String newCustRequestStatusId) {
		String oldCustRequestStatusId = custRequestStatusId;
		custRequestStatusId = newCustRequestStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_STATUS_ID, oldCustRequestStatusId, custRequestStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusDate(Date newStatusDate) {
		Date oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_STATUS__STATUS_DATE, oldStatusDate, statusDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_STATUS__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_STATUS_ID:
				return getCustRequestStatusId();
			case RequestPackage.CUST_REQUEST_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return getChangeByUserLoginId();
			case RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_ID:
				return getCustRequestId();
			case RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_ITEM_SEQ_ID:
				return getCustRequestItemSeqId();
			case RequestPackage.CUST_REQUEST_STATUS__STATUS_DATE:
				return getStatusDate();
			case RequestPackage.CUST_REQUEST_STATUS__STATUS_ID:
				return getStatusId();
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
			case RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_STATUS_ID:
				setCustRequestStatusId((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_ID:
				setCustRequestId((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_ITEM_SEQ_ID:
				setCustRequestItemSeqId((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_STATUS__STATUS_DATE:
				setStatusDate((Date)newValue);
				return;
			case RequestPackage.CUST_REQUEST_STATUS__STATUS_ID:
				setStatusId((String)newValue);
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
			case RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_STATUS_ID:
				setCustRequestStatusId(CUST_REQUEST_STATUS_ID_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId(CHANGE_BY_USER_LOGIN_ID_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_ID:
				setCustRequestId(CUST_REQUEST_ID_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_ITEM_SEQ_ID:
				setCustRequestItemSeqId(CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_STATUS__STATUS_DATE:
				setStatusDate(STATUS_DATE_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_STATUS__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
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
			case RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_STATUS_ID:
				return CUST_REQUEST_STATUS_ID_EDEFAULT == null ? custRequestStatusId != null : !CUST_REQUEST_STATUS_ID_EDEFAULT.equals(custRequestStatusId);
			case RequestPackage.CUST_REQUEST_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return CHANGE_BY_USER_LOGIN_ID_EDEFAULT == null ? changeByUserLoginId != null : !CHANGE_BY_USER_LOGIN_ID_EDEFAULT.equals(changeByUserLoginId);
			case RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_ID:
				return CUST_REQUEST_ID_EDEFAULT == null ? custRequestId != null : !CUST_REQUEST_ID_EDEFAULT.equals(custRequestId);
			case RequestPackage.CUST_REQUEST_STATUS__CUST_REQUEST_ITEM_SEQ_ID:
				return CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT == null ? custRequestItemSeqId != null : !CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT.equals(custRequestItemSeqId);
			case RequestPackage.CUST_REQUEST_STATUS__STATUS_DATE:
				return STATUS_DATE_EDEFAULT == null ? statusDate != null : !STATUS_DATE_EDEFAULT.equals(statusDate);
			case RequestPackage.CUST_REQUEST_STATUS__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
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
		result.append(" (custRequestStatusId: ");
		result.append(custRequestStatusId);
		result.append(", changeByUserLoginId: ");
		result.append(changeByUserLoginId);
		result.append(", custRequestId: ");
		result.append(custRequestId);
		result.append(", custRequestItemSeqId: ");
		result.append(custRequestItemSeqId);
		result.append(", statusDate: ");
		result.append(statusDate);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(')');
		return result.toString();
	}

} //CustRequestStatusImpl
