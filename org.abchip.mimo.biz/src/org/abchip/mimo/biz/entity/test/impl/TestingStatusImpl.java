/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.entity.test.TestingStatus;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl#getTestingStatusId <em>Testing Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl#getTestingId <em>Testing Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingStatusImpl extends BizEntityImpl implements TestingStatus {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTestingStatusId() <em>Testing Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingStatusId() <em>Testing Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingStatusId()
	 * @generated
	 * @ordered
	 */
	protected String testingStatusId = TESTING_STATUS_ID_EDEFAULT;
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
	 * The default value of the '{@link #getTestingId() <em>Testing Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingId()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTestingId() <em>Testing Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingId()
	 * @generated
	 * @ordered
	 */
	protected String testingId = TESTING_ID_EDEFAULT;
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
	 * The cached value of the '{@link #getChangeByUserLoginId() <em>Change By User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin changeByUserLoginId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TESTING_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getChangeByUserLoginId() {
		if (changeByUserLoginId != null && ((EObject)changeByUserLoginId).eIsProxy()) {
			InternalEObject oldChangeByUserLoginId = (InternalEObject)changeByUserLoginId;
			changeByUserLoginId = (UserLogin)eResolveProxy(oldChangeByUserLoginId);
			if (changeByUserLoginId != oldChangeByUserLoginId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID, oldChangeByUserLoginId, changeByUserLoginId));
			}
		}
		return changeByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetChangeByUserLoginId() {
		return changeByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeByUserLoginId(UserLogin newChangeByUserLoginId) {
		UserLogin oldChangeByUserLoginId = changeByUserLoginId;
		changeByUserLoginId = newChangeByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID, oldChangeByUserLoginId, changeByUserLoginId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_STATUS__STATUS_DATE, oldStatusDate, statusDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.TESTING_STATUS__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_STATUS__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingId() {
		return testingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingId(String newTestingId) {
		String oldTestingId = testingId;
		testingId = newTestingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_STATUS__TESTING_ID, oldTestingId, testingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingStatusId() {
		return testingStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingStatusId(String newTestingStatusId) {
		String oldTestingStatusId = testingStatusId;
		testingStatusId = newTestingStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_STATUS__TESTING_STATUS_ID, oldTestingStatusId, testingStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.TESTING_STATUS__TESTING_STATUS_ID:
				return getTestingStatusId();
			case TestPackage.TESTING_STATUS__STATUS_DATE:
				return getStatusDate();
			case TestPackage.TESTING_STATUS__TESTING_ID:
				return getTestingId();
			case TestPackage.TESTING_STATUS__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case TestPackage.TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID:
				if (resolve) return getChangeByUserLoginId();
				return basicGetChangeByUserLoginId();
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
			case TestPackage.TESTING_STATUS__TESTING_STATUS_ID:
				setTestingStatusId((String)newValue);
				return;
			case TestPackage.TESTING_STATUS__STATUS_DATE:
				setStatusDate((Date)newValue);
				return;
			case TestPackage.TESTING_STATUS__TESTING_ID:
				setTestingId((String)newValue);
				return;
			case TestPackage.TESTING_STATUS__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case TestPackage.TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((UserLogin)newValue);
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
			case TestPackage.TESTING_STATUS__TESTING_STATUS_ID:
				setTestingStatusId(TESTING_STATUS_ID_EDEFAULT);
				return;
			case TestPackage.TESTING_STATUS__STATUS_DATE:
				setStatusDate(STATUS_DATE_EDEFAULT);
				return;
			case TestPackage.TESTING_STATUS__TESTING_ID:
				setTestingId(TESTING_ID_EDEFAULT);
				return;
			case TestPackage.TESTING_STATUS__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case TestPackage.TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((UserLogin)null);
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
			case TestPackage.TESTING_STATUS__TESTING_STATUS_ID:
				return TESTING_STATUS_ID_EDEFAULT == null ? testingStatusId != null : !TESTING_STATUS_ID_EDEFAULT.equals(testingStatusId);
			case TestPackage.TESTING_STATUS__STATUS_DATE:
				return STATUS_DATE_EDEFAULT == null ? statusDate != null : !STATUS_DATE_EDEFAULT.equals(statusDate);
			case TestPackage.TESTING_STATUS__TESTING_ID:
				return TESTING_ID_EDEFAULT == null ? testingId != null : !TESTING_ID_EDEFAULT.equals(testingId);
			case TestPackage.TESTING_STATUS__STATUS_ID:
				return statusId != null;
			case TestPackage.TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return changeByUserLoginId != null;
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
		result.append(" (testingStatusId: ");
		result.append(testingStatusId);
		result.append(", statusDate: ");
		result.append(statusDate);
		result.append(", testingId: ");
		result.append(testingId);
		result.append(')');
		return result.toString();
	}

} //TestingStatusImpl
