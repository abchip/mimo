/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule.impl;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.service.schedule.RecurrenceInfo;
import org.abchip.mimo.biz.service.schedule.RecurrenceRule;
import org.abchip.mimo.biz.service.schedule.SchedulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recurrence Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl#getExceptionDateTimes <em>Exception Date Times</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl#getRecurrenceCount <em>Recurrence Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl#getRecurrenceDateTimes <em>Recurrence Date Times</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl#getRecurrenceRuleId <em>Recurrence Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl#getExceptionRuleId <em>Exception Rule Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecurrenceInfoImpl extends BizEntityImpl implements RecurrenceInfo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRecurrenceInfoId() <em>Recurrence Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceInfoId()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURRENCE_INFO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurrenceInfoId() <em>Recurrence Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceInfoId()
	 * @generated
	 * @ordered
	 */
	protected String recurrenceInfoId = RECURRENCE_INFO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionDateTimes() <em>Exception Date Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionDateTimes()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_DATE_TIMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionDateTimes() <em>Exception Date Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionDateTimes()
	 * @generated
	 * @ordered
	 */
	protected String exceptionDateTimes = EXCEPTION_DATE_TIMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurrenceCount() <em>Recurrence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceCount()
	 * @generated
	 * @ordered
	 */
	protected static final long RECURRENCE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRecurrenceCount() <em>Recurrence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceCount()
	 * @generated
	 * @ordered
	 */
	protected long recurrenceCount = RECURRENCE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurrenceDateTimes() <em>Recurrence Date Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceDateTimes()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURRENCE_DATE_TIMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurrenceDateTimes() <em>Recurrence Date Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceDateTimes()
	 * @generated
	 * @ordered
	 */
	protected String recurrenceDateTimes = RECURRENCE_DATE_TIMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date startDateTime = START_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecurrenceRuleId() <em>Recurrence Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceRuleId()
	 * @generated
	 * @ordered
	 */
	protected RecurrenceRule recurrenceRuleId;

	/**
	 * The cached value of the '{@link #getExceptionRuleId() <em>Exception Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionRuleId()
	 * @generated
	 * @ordered
	 */
	protected RecurrenceRule exceptionRuleId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecurrenceInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.RECURRENCE_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecurrenceInfoId() {
		return recurrenceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfoId(String newRecurrenceInfoId) {
		String oldRecurrenceInfoId = recurrenceInfoId;
		recurrenceInfoId = newRecurrenceInfoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_INFO__RECURRENCE_INFO_ID, oldRecurrenceInfoId, recurrenceInfoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExceptionDateTimes() {
		return exceptionDateTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionDateTimes(String newExceptionDateTimes) {
		String oldExceptionDateTimes = exceptionDateTimes;
		exceptionDateTimes = newExceptionDateTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_INFO__EXCEPTION_DATE_TIMES, oldExceptionDateTimes, exceptionDateTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceRule getExceptionRuleId() {
		if (exceptionRuleId != null && ((EObject)exceptionRuleId).eIsProxy()) {
			InternalEObject oldExceptionRuleId = (InternalEObject)exceptionRuleId;
			exceptionRuleId = (RecurrenceRule)eResolveProxy(oldExceptionRuleId);
			if (exceptionRuleId != oldExceptionRuleId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.RECURRENCE_INFO__EXCEPTION_RULE_ID, oldExceptionRuleId, exceptionRuleId));
			}
		}
		return exceptionRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurrenceRule basicGetExceptionRuleId() {
		return exceptionRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionRuleId(RecurrenceRule newExceptionRuleId) {
		RecurrenceRule oldExceptionRuleId = exceptionRuleId;
		exceptionRuleId = newExceptionRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_INFO__EXCEPTION_RULE_ID, oldExceptionRuleId, exceptionRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRecurrenceCount() {
		return recurrenceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceCount(long newRecurrenceCount) {
		long oldRecurrenceCount = recurrenceCount;
		recurrenceCount = newRecurrenceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_INFO__RECURRENCE_COUNT, oldRecurrenceCount, recurrenceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecurrenceDateTimes() {
		return recurrenceDateTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceDateTimes(String newRecurrenceDateTimes) {
		String oldRecurrenceDateTimes = recurrenceDateTimes;
		recurrenceDateTimes = newRecurrenceDateTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_INFO__RECURRENCE_DATE_TIMES, oldRecurrenceDateTimes, recurrenceDateTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceRule getRecurrenceRuleId() {
		if (recurrenceRuleId != null && ((EObject)recurrenceRuleId).eIsProxy()) {
			InternalEObject oldRecurrenceRuleId = (InternalEObject)recurrenceRuleId;
			recurrenceRuleId = (RecurrenceRule)eResolveProxy(oldRecurrenceRuleId);
			if (recurrenceRuleId != oldRecurrenceRuleId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.RECURRENCE_INFO__RECURRENCE_RULE_ID, oldRecurrenceRuleId, recurrenceRuleId));
			}
		}
		return recurrenceRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurrenceRule basicGetRecurrenceRuleId() {
		return recurrenceRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceRuleId(RecurrenceRule newRecurrenceRuleId) {
		RecurrenceRule oldRecurrenceRuleId = recurrenceRuleId;
		recurrenceRuleId = newRecurrenceRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_INFO__RECURRENCE_RULE_ID, oldRecurrenceRuleId, recurrenceRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDateTime() {
		return startDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDateTime(Date newStartDateTime) {
		Date oldStartDateTime = startDateTime;
		startDateTime = newStartDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_INFO__START_DATE_TIME, oldStartDateTime, startDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> invoices() {
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
	public List<String> jobSandboxs() {
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
	public List<String> shoppingLists() {
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
	public List<String> workEfforts() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_INFO_ID:
				return getRecurrenceInfoId();
			case SchedulePackage.RECURRENCE_INFO__EXCEPTION_DATE_TIMES:
				return getExceptionDateTimes();
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_COUNT:
				return getRecurrenceCount();
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_DATE_TIMES:
				return getRecurrenceDateTimes();
			case SchedulePackage.RECURRENCE_INFO__START_DATE_TIME:
				return getStartDateTime();
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_RULE_ID:
				if (resolve) return getRecurrenceRuleId();
				return basicGetRecurrenceRuleId();
			case SchedulePackage.RECURRENCE_INFO__EXCEPTION_RULE_ID:
				if (resolve) return getExceptionRuleId();
				return basicGetExceptionRuleId();
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
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_INFO_ID:
				setRecurrenceInfoId((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_INFO__EXCEPTION_DATE_TIMES:
				setExceptionDateTimes((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_COUNT:
				setRecurrenceCount((Long)newValue);
				return;
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_DATE_TIMES:
				setRecurrenceDateTimes((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_INFO__START_DATE_TIME:
				setStartDateTime((Date)newValue);
				return;
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_RULE_ID:
				setRecurrenceRuleId((RecurrenceRule)newValue);
				return;
			case SchedulePackage.RECURRENCE_INFO__EXCEPTION_RULE_ID:
				setExceptionRuleId((RecurrenceRule)newValue);
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
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_INFO_ID:
				setRecurrenceInfoId(RECURRENCE_INFO_ID_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_INFO__EXCEPTION_DATE_TIMES:
				setExceptionDateTimes(EXCEPTION_DATE_TIMES_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_COUNT:
				setRecurrenceCount(RECURRENCE_COUNT_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_DATE_TIMES:
				setRecurrenceDateTimes(RECURRENCE_DATE_TIMES_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_INFO__START_DATE_TIME:
				setStartDateTime(START_DATE_TIME_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_RULE_ID:
				setRecurrenceRuleId((RecurrenceRule)null);
				return;
			case SchedulePackage.RECURRENCE_INFO__EXCEPTION_RULE_ID:
				setExceptionRuleId((RecurrenceRule)null);
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
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_INFO_ID:
				return RECURRENCE_INFO_ID_EDEFAULT == null ? recurrenceInfoId != null : !RECURRENCE_INFO_ID_EDEFAULT.equals(recurrenceInfoId);
			case SchedulePackage.RECURRENCE_INFO__EXCEPTION_DATE_TIMES:
				return EXCEPTION_DATE_TIMES_EDEFAULT == null ? exceptionDateTimes != null : !EXCEPTION_DATE_TIMES_EDEFAULT.equals(exceptionDateTimes);
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_COUNT:
				return recurrenceCount != RECURRENCE_COUNT_EDEFAULT;
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_DATE_TIMES:
				return RECURRENCE_DATE_TIMES_EDEFAULT == null ? recurrenceDateTimes != null : !RECURRENCE_DATE_TIMES_EDEFAULT.equals(recurrenceDateTimes);
			case SchedulePackage.RECURRENCE_INFO__START_DATE_TIME:
				return START_DATE_TIME_EDEFAULT == null ? startDateTime != null : !START_DATE_TIME_EDEFAULT.equals(startDateTime);
			case SchedulePackage.RECURRENCE_INFO__RECURRENCE_RULE_ID:
				return recurrenceRuleId != null;
			case SchedulePackage.RECURRENCE_INFO__EXCEPTION_RULE_ID:
				return exceptionRuleId != null;
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
		result.append(" (recurrenceInfoId: ");
		result.append(recurrenceInfoId);
		result.append(", exceptionDateTimes: ");
		result.append(exceptionDateTimes);
		result.append(", recurrenceCount: ");
		result.append(recurrenceCount);
		result.append(", recurrenceDateTimes: ");
		result.append(recurrenceDateTimes);
		result.append(", startDateTime: ");
		result.append(startDateTime);
		result.append(')');
		return result.toString();
	}

} //RecurrenceInfoImpl
