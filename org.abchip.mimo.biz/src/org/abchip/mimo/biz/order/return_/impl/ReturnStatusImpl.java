/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.abchip.mimo.biz.order.return_.ReturnStatus;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnStatusImpl#getReturnStatusId <em>Return Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnStatusImpl#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnStatusImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnStatusImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnStatusImpl#getStatusDatetime <em>Status Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnStatusImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnStatusImpl extends BizEntityImpl implements ReturnStatus {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getReturnStatusId() <em>Return Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnStatusId() <em>Return Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnStatusId()
	 * @generated
	 * @ordered
	 */
	protected String returnStatusId = RETURN_STATUS_ID_EDEFAULT;

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
	 * The default value of the '{@link #getReturnId() <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnId() <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected String returnId = RETURN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnItemSeqId() <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnItemSeqId() <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String returnItemSeqId = RETURN_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusDatetime() <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final Date STATUS_DATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusDatetime() <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDatetime()
	 * @generated
	 * @ordered
	 */
	protected Date statusDatetime = STATUS_DATETIME_EDEFAULT;

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
	protected ReturnStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_STATUS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_STATUS__CHANGE_BY_USER_LOGIN_ID, oldChangeByUserLoginId, changeByUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnId() {
		return returnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(String newReturnId) {
		String oldReturnId = returnId;
		returnId = newReturnId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_STATUS__RETURN_ID, oldReturnId, returnId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemSeqId() {
		return returnItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemSeqId(String newReturnItemSeqId) {
		String oldReturnItemSeqId = returnItemSeqId;
		returnItemSeqId = newReturnItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_STATUS__RETURN_ITEM_SEQ_ID, oldReturnItemSeqId, returnItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnStatusId() {
		return returnStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnStatusId(String newReturnStatusId) {
		String oldReturnStatusId = returnStatusId;
		returnStatusId = newReturnStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_STATUS__RETURN_STATUS_ID, oldReturnStatusId, returnStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStatusDatetime() {
		return statusDatetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusDatetime(Date newStatusDatetime) {
		Date oldStatusDatetime = statusDatetime;
		statusDatetime = newStatusDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_STATUS__STATUS_DATETIME, oldStatusDatetime, statusDatetime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_STATUS__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReturnPackage.RETURN_STATUS__RETURN_STATUS_ID:
				return getReturnStatusId();
			case ReturnPackage.RETURN_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return getChangeByUserLoginId();
			case ReturnPackage.RETURN_STATUS__RETURN_ID:
				return getReturnId();
			case ReturnPackage.RETURN_STATUS__RETURN_ITEM_SEQ_ID:
				return getReturnItemSeqId();
			case ReturnPackage.RETURN_STATUS__STATUS_DATETIME:
				return getStatusDatetime();
			case ReturnPackage.RETURN_STATUS__STATUS_ID:
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
			case ReturnPackage.RETURN_STATUS__RETURN_STATUS_ID:
				setReturnStatusId((String)newValue);
				return;
			case ReturnPackage.RETURN_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((String)newValue);
				return;
			case ReturnPackage.RETURN_STATUS__RETURN_ID:
				setReturnId((String)newValue);
				return;
			case ReturnPackage.RETURN_STATUS__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_STATUS__STATUS_DATETIME:
				setStatusDatetime((Date)newValue);
				return;
			case ReturnPackage.RETURN_STATUS__STATUS_ID:
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
			case ReturnPackage.RETURN_STATUS__RETURN_STATUS_ID:
				setReturnStatusId(RETURN_STATUS_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId(CHANGE_BY_USER_LOGIN_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_STATUS__RETURN_ID:
				setReturnId(RETURN_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_STATUS__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId(RETURN_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_STATUS__STATUS_DATETIME:
				setStatusDatetime(STATUS_DATETIME_EDEFAULT);
				return;
			case ReturnPackage.RETURN_STATUS__STATUS_ID:
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
			case ReturnPackage.RETURN_STATUS__RETURN_STATUS_ID:
				return RETURN_STATUS_ID_EDEFAULT == null ? returnStatusId != null : !RETURN_STATUS_ID_EDEFAULT.equals(returnStatusId);
			case ReturnPackage.RETURN_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return CHANGE_BY_USER_LOGIN_ID_EDEFAULT == null ? changeByUserLoginId != null : !CHANGE_BY_USER_LOGIN_ID_EDEFAULT.equals(changeByUserLoginId);
			case ReturnPackage.RETURN_STATUS__RETURN_ID:
				return RETURN_ID_EDEFAULT == null ? returnId != null : !RETURN_ID_EDEFAULT.equals(returnId);
			case ReturnPackage.RETURN_STATUS__RETURN_ITEM_SEQ_ID:
				return RETURN_ITEM_SEQ_ID_EDEFAULT == null ? returnItemSeqId != null : !RETURN_ITEM_SEQ_ID_EDEFAULT.equals(returnItemSeqId);
			case ReturnPackage.RETURN_STATUS__STATUS_DATETIME:
				return STATUS_DATETIME_EDEFAULT == null ? statusDatetime != null : !STATUS_DATETIME_EDEFAULT.equals(statusDatetime);
			case ReturnPackage.RETURN_STATUS__STATUS_ID:
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
		result.append(" (returnStatusId: ");
		result.append(returnStatusId);
		result.append(", changeByUserLoginId: ");
		result.append(changeByUserLoginId);
		result.append(", returnId: ");
		result.append(returnId);
		result.append(", returnItemSeqId: ");
		result.append(returnItemSeqId);
		result.append(", statusDatetime: ");
		result.append(statusDatetime);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(')');
		return result.toString();
	}

} //ReturnStatusImpl
