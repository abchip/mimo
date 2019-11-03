/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import java.util.Date;

import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.entity.test.TestingStatus;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl#getTestingId <em>Testing Id</em>}</li>
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
			case TestPackage.TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return getChangeByUserLoginId();
			case TestPackage.TESTING_STATUS__STATUS_DATE:
				return getStatusDate();
			case TestPackage.TESTING_STATUS__STATUS_ID:
				return getStatusId();
			case TestPackage.TESTING_STATUS__TESTING_ID:
				return getTestingId();
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
			case TestPackage.TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((String)newValue);
				return;
			case TestPackage.TESTING_STATUS__STATUS_DATE:
				setStatusDate((Date)newValue);
				return;
			case TestPackage.TESTING_STATUS__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case TestPackage.TESTING_STATUS__TESTING_ID:
				setTestingId((String)newValue);
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
			case TestPackage.TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId(CHANGE_BY_USER_LOGIN_ID_EDEFAULT);
				return;
			case TestPackage.TESTING_STATUS__STATUS_DATE:
				setStatusDate(STATUS_DATE_EDEFAULT);
				return;
			case TestPackage.TESTING_STATUS__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case TestPackage.TESTING_STATUS__TESTING_ID:
				setTestingId(TESTING_ID_EDEFAULT);
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
			case TestPackage.TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return CHANGE_BY_USER_LOGIN_ID_EDEFAULT == null ? changeByUserLoginId != null : !CHANGE_BY_USER_LOGIN_ID_EDEFAULT.equals(changeByUserLoginId);
			case TestPackage.TESTING_STATUS__STATUS_DATE:
				return STATUS_DATE_EDEFAULT == null ? statusDate != null : !STATUS_DATE_EDEFAULT.equals(statusDate);
			case TestPackage.TESTING_STATUS__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case TestPackage.TESTING_STATUS__TESTING_ID:
				return TESTING_ID_EDEFAULT == null ? testingId != null : !TESTING_ID_EDEFAULT.equals(testingId);
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
		result.append(", changeByUserLoginId: ");
		result.append(changeByUserLoginId);
		result.append(", statusDate: ");
		result.append(statusDate);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", testingId: ");
		result.append(testingId);
		result.append(')');
		return result.toString();
	}

} //TestingStatusImpl
