/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule.impl;

import java.util.Date;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.service.schedule.RecurrenceInfo;
import org.abchip.mimo.biz.service.schedule.RecurrenceRule;
import org.abchip.mimo.biz.service.schedule.SchedulePackage;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl#getExceptionRuleId <em>Exception Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl#getRecurrenceCount <em>Recurrence Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl#getRecurrenceDateTimes <em>Recurrence Date Times</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl#getRecurrenceRuleId <em>Recurrence Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceInfoImpl#getStartDateTime <em>Start Date Time</em>}</li>
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
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_INFO__RECURRENCE_INFO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfoId(String newRecurrenceInfoId) {
		eSet(SchedulePackage.Literals.RECURRENCE_INFO__RECURRENCE_INFO_ID, newRecurrenceInfoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExceptionDateTimes() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_INFO__EXCEPTION_DATE_TIMES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionDateTimes(String newExceptionDateTimes) {
		eSet(SchedulePackage.Literals.RECURRENCE_INFO__EXCEPTION_DATE_TIMES, newExceptionDateTimes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceRule getExceptionRuleId() {
		return (RecurrenceRule)eGet(SchedulePackage.Literals.RECURRENCE_INFO__EXCEPTION_RULE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionRuleId(RecurrenceRule newExceptionRuleId) {
		eSet(SchedulePackage.Literals.RECURRENCE_INFO__EXCEPTION_RULE_ID, newExceptionRuleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRecurrenceCount() {
		return (Long)eGet(SchedulePackage.Literals.RECURRENCE_INFO__RECURRENCE_COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceCount(long newRecurrenceCount) {
		eSet(SchedulePackage.Literals.RECURRENCE_INFO__RECURRENCE_COUNT, newRecurrenceCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecurrenceDateTimes() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_INFO__RECURRENCE_DATE_TIMES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceDateTimes(String newRecurrenceDateTimes) {
		eSet(SchedulePackage.Literals.RECURRENCE_INFO__RECURRENCE_DATE_TIMES, newRecurrenceDateTimes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceRule getRecurrenceRuleId() {
		return (RecurrenceRule)eGet(SchedulePackage.Literals.RECURRENCE_INFO__RECURRENCE_RULE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceRuleId(RecurrenceRule newRecurrenceRuleId) {
		eSet(SchedulePackage.Literals.RECURRENCE_INFO__RECURRENCE_RULE_ID, newRecurrenceRuleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDateTime() {
		return (Date)eGet(SchedulePackage.Literals.RECURRENCE_INFO__START_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDateTime(Date newStartDateTime) {
		eSet(SchedulePackage.Literals.RECURRENCE_INFO__START_DATE_TIME, newStartDateTime);
	}

} //RecurrenceInfoImpl
