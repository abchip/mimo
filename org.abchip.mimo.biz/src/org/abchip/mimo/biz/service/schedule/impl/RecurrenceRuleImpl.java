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
import org.abchip.mimo.biz.service.schedule.RecurrenceRule;
import org.abchip.mimo.biz.service.schedule.SchedulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recurrence Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getRecurrenceRuleId <em>Recurrence Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getByDayList <em>By Day List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getByHourList <em>By Hour List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getByMinuteList <em>By Minute List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getByMonthDayList <em>By Month Day List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getByMonthList <em>By Month List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getBySecondList <em>By Second List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getBySetPosList <em>By Set Pos List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getByWeekNoList <em>By Week No List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getByYearDayList <em>By Year Day List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getCountNumber <em>Count Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getIntervalNumber <em>Interval Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getUntilDateTime <em>Until Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getWeekStart <em>Week Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.RecurrenceRuleImpl#getXName <em>XName</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecurrenceRuleImpl extends BizEntityImpl implements RecurrenceRule {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRecurrenceRuleId() <em>Recurrence Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceRuleId()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURRENCE_RULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurrenceRuleId() <em>Recurrence Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceRuleId()
	 * @generated
	 * @ordered
	 */
	protected String recurrenceRuleId = RECURRENCE_RULE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getByDayList() <em>By Day List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByDayList()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_DAY_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByDayList() <em>By Day List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByDayList()
	 * @generated
	 * @ordered
	 */
	protected String byDayList = BY_DAY_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getByHourList() <em>By Hour List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByHourList()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_HOUR_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByHourList() <em>By Hour List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByHourList()
	 * @generated
	 * @ordered
	 */
	protected String byHourList = BY_HOUR_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getByMinuteList() <em>By Minute List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByMinuteList()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_MINUTE_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByMinuteList() <em>By Minute List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByMinuteList()
	 * @generated
	 * @ordered
	 */
	protected String byMinuteList = BY_MINUTE_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getByMonthDayList() <em>By Month Day List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByMonthDayList()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_MONTH_DAY_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByMonthDayList() <em>By Month Day List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByMonthDayList()
	 * @generated
	 * @ordered
	 */
	protected String byMonthDayList = BY_MONTH_DAY_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getByMonthList() <em>By Month List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByMonthList()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_MONTH_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByMonthList() <em>By Month List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByMonthList()
	 * @generated
	 * @ordered
	 */
	protected String byMonthList = BY_MONTH_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBySecondList() <em>By Second List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBySecondList()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_SECOND_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBySecondList() <em>By Second List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBySecondList()
	 * @generated
	 * @ordered
	 */
	protected String bySecondList = BY_SECOND_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBySetPosList() <em>By Set Pos List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBySetPosList()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_SET_POS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBySetPosList() <em>By Set Pos List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBySetPosList()
	 * @generated
	 * @ordered
	 */
	protected String bySetPosList = BY_SET_POS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getByWeekNoList() <em>By Week No List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByWeekNoList()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_WEEK_NO_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByWeekNoList() <em>By Week No List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByWeekNoList()
	 * @generated
	 * @ordered
	 */
	protected String byWeekNoList = BY_WEEK_NO_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getByYearDayList() <em>By Year Day List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByYearDayList()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_YEAR_DAY_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByYearDayList() <em>By Year Day List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByYearDayList()
	 * @generated
	 * @ordered
	 */
	protected String byYearDayList = BY_YEAR_DAY_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountNumber() <em>Count Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long COUNT_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCountNumber() <em>Count Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountNumber()
	 * @generated
	 * @ordered
	 */
	protected long countNumber = COUNT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected String frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntervalNumber() <em>Interval Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long INTERVAL_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIntervalNumber() <em>Interval Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalNumber()
	 * @generated
	 * @ordered
	 */
	protected long intervalNumber = INTERVAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUntilDateTime() <em>Until Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date UNTIL_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUntilDateTime() <em>Until Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date untilDateTime = UNTIL_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeekStart() <em>Week Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekStart()
	 * @generated
	 * @ordered
	 */
	protected static final String WEEK_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeekStart() <em>Week Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekStart()
	 * @generated
	 * @ordered
	 */
	protected String weekStart = WEEK_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getXName() <em>XName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXName()
	 * @generated
	 * @ordered
	 */
	protected static final String XNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXName() <em>XName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXName()
	 * @generated
	 * @ordered
	 */
	protected String xName = XNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecurrenceRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.RECURRENCE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecurrenceRuleId() {
		return recurrenceRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceRuleId(String newRecurrenceRuleId) {
		String oldRecurrenceRuleId = recurrenceRuleId;
		recurrenceRuleId = newRecurrenceRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__RECURRENCE_RULE_ID, oldRecurrenceRuleId, recurrenceRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByDayList() {
		return byDayList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByDayList(String newByDayList) {
		String oldByDayList = byDayList;
		byDayList = newByDayList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__BY_DAY_LIST, oldByDayList, byDayList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByHourList() {
		return byHourList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByHourList(String newByHourList) {
		String oldByHourList = byHourList;
		byHourList = newByHourList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__BY_HOUR_LIST, oldByHourList, byHourList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByMinuteList() {
		return byMinuteList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByMinuteList(String newByMinuteList) {
		String oldByMinuteList = byMinuteList;
		byMinuteList = newByMinuteList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__BY_MINUTE_LIST, oldByMinuteList, byMinuteList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByMonthDayList() {
		return byMonthDayList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByMonthDayList(String newByMonthDayList) {
		String oldByMonthDayList = byMonthDayList;
		byMonthDayList = newByMonthDayList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__BY_MONTH_DAY_LIST, oldByMonthDayList, byMonthDayList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByMonthList() {
		return byMonthList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByMonthList(String newByMonthList) {
		String oldByMonthList = byMonthList;
		byMonthList = newByMonthList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__BY_MONTH_LIST, oldByMonthList, byMonthList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBySecondList() {
		return bySecondList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBySecondList(String newBySecondList) {
		String oldBySecondList = bySecondList;
		bySecondList = newBySecondList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__BY_SECOND_LIST, oldBySecondList, bySecondList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBySetPosList() {
		return bySetPosList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBySetPosList(String newBySetPosList) {
		String oldBySetPosList = bySetPosList;
		bySetPosList = newBySetPosList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__BY_SET_POS_LIST, oldBySetPosList, bySetPosList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByWeekNoList() {
		return byWeekNoList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByWeekNoList(String newByWeekNoList) {
		String oldByWeekNoList = byWeekNoList;
		byWeekNoList = newByWeekNoList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__BY_WEEK_NO_LIST, oldByWeekNoList, byWeekNoList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByYearDayList() {
		return byYearDayList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByYearDayList(String newByYearDayList) {
		String oldByYearDayList = byYearDayList;
		byYearDayList = newByYearDayList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__BY_YEAR_DAY_LIST, oldByYearDayList, byYearDayList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCountNumber() {
		return countNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountNumber(long newCountNumber) {
		long oldCountNumber = countNumber;
		countNumber = newCountNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__COUNT_NUMBER, oldCountNumber, countNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequency(String newFrequency) {
		String oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getIntervalNumber() {
		return intervalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalNumber(long newIntervalNumber) {
		long oldIntervalNumber = intervalNumber;
		intervalNumber = newIntervalNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__INTERVAL_NUMBER, oldIntervalNumber, intervalNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUntilDateTime() {
		return untilDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUntilDateTime(Date newUntilDateTime) {
		Date oldUntilDateTime = untilDateTime;
		untilDateTime = newUntilDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__UNTIL_DATE_TIME, oldUntilDateTime, untilDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeekStart() {
		return weekStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeekStart(String newWeekStart) {
		String oldWeekStart = weekStart;
		weekStart = newWeekStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__WEEK_START, oldWeekStart, weekStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXName() {
		return xName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXName(String newXName) {
		String oldXName = xName;
		xName = newXName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.RECURRENCE_RULE__XNAME, oldXName, xName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> exceptionRecurrenceInfos() {
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
	public List<String> recurrenceInfos() {
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
			case SchedulePackage.RECURRENCE_RULE__RECURRENCE_RULE_ID:
				return getRecurrenceRuleId();
			case SchedulePackage.RECURRENCE_RULE__BY_DAY_LIST:
				return getByDayList();
			case SchedulePackage.RECURRENCE_RULE__BY_HOUR_LIST:
				return getByHourList();
			case SchedulePackage.RECURRENCE_RULE__BY_MINUTE_LIST:
				return getByMinuteList();
			case SchedulePackage.RECURRENCE_RULE__BY_MONTH_DAY_LIST:
				return getByMonthDayList();
			case SchedulePackage.RECURRENCE_RULE__BY_MONTH_LIST:
				return getByMonthList();
			case SchedulePackage.RECURRENCE_RULE__BY_SECOND_LIST:
				return getBySecondList();
			case SchedulePackage.RECURRENCE_RULE__BY_SET_POS_LIST:
				return getBySetPosList();
			case SchedulePackage.RECURRENCE_RULE__BY_WEEK_NO_LIST:
				return getByWeekNoList();
			case SchedulePackage.RECURRENCE_RULE__BY_YEAR_DAY_LIST:
				return getByYearDayList();
			case SchedulePackage.RECURRENCE_RULE__COUNT_NUMBER:
				return getCountNumber();
			case SchedulePackage.RECURRENCE_RULE__FREQUENCY:
				return getFrequency();
			case SchedulePackage.RECURRENCE_RULE__INTERVAL_NUMBER:
				return getIntervalNumber();
			case SchedulePackage.RECURRENCE_RULE__UNTIL_DATE_TIME:
				return getUntilDateTime();
			case SchedulePackage.RECURRENCE_RULE__WEEK_START:
				return getWeekStart();
			case SchedulePackage.RECURRENCE_RULE__XNAME:
				return getXName();
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
			case SchedulePackage.RECURRENCE_RULE__RECURRENCE_RULE_ID:
				setRecurrenceRuleId((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_DAY_LIST:
				setByDayList((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_HOUR_LIST:
				setByHourList((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_MINUTE_LIST:
				setByMinuteList((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_MONTH_DAY_LIST:
				setByMonthDayList((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_MONTH_LIST:
				setByMonthList((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_SECOND_LIST:
				setBySecondList((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_SET_POS_LIST:
				setBySetPosList((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_WEEK_NO_LIST:
				setByWeekNoList((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_YEAR_DAY_LIST:
				setByYearDayList((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__COUNT_NUMBER:
				setCountNumber((Long)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__FREQUENCY:
				setFrequency((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__INTERVAL_NUMBER:
				setIntervalNumber((Long)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__UNTIL_DATE_TIME:
				setUntilDateTime((Date)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__WEEK_START:
				setWeekStart((String)newValue);
				return;
			case SchedulePackage.RECURRENCE_RULE__XNAME:
				setXName((String)newValue);
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
			case SchedulePackage.RECURRENCE_RULE__RECURRENCE_RULE_ID:
				setRecurrenceRuleId(RECURRENCE_RULE_ID_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_DAY_LIST:
				setByDayList(BY_DAY_LIST_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_HOUR_LIST:
				setByHourList(BY_HOUR_LIST_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_MINUTE_LIST:
				setByMinuteList(BY_MINUTE_LIST_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_MONTH_DAY_LIST:
				setByMonthDayList(BY_MONTH_DAY_LIST_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_MONTH_LIST:
				setByMonthList(BY_MONTH_LIST_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_SECOND_LIST:
				setBySecondList(BY_SECOND_LIST_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_SET_POS_LIST:
				setBySetPosList(BY_SET_POS_LIST_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_WEEK_NO_LIST:
				setByWeekNoList(BY_WEEK_NO_LIST_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__BY_YEAR_DAY_LIST:
				setByYearDayList(BY_YEAR_DAY_LIST_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__COUNT_NUMBER:
				setCountNumber(COUNT_NUMBER_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__INTERVAL_NUMBER:
				setIntervalNumber(INTERVAL_NUMBER_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__UNTIL_DATE_TIME:
				setUntilDateTime(UNTIL_DATE_TIME_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__WEEK_START:
				setWeekStart(WEEK_START_EDEFAULT);
				return;
			case SchedulePackage.RECURRENCE_RULE__XNAME:
				setXName(XNAME_EDEFAULT);
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
			case SchedulePackage.RECURRENCE_RULE__RECURRENCE_RULE_ID:
				return RECURRENCE_RULE_ID_EDEFAULT == null ? recurrenceRuleId != null : !RECURRENCE_RULE_ID_EDEFAULT.equals(recurrenceRuleId);
			case SchedulePackage.RECURRENCE_RULE__BY_DAY_LIST:
				return BY_DAY_LIST_EDEFAULT == null ? byDayList != null : !BY_DAY_LIST_EDEFAULT.equals(byDayList);
			case SchedulePackage.RECURRENCE_RULE__BY_HOUR_LIST:
				return BY_HOUR_LIST_EDEFAULT == null ? byHourList != null : !BY_HOUR_LIST_EDEFAULT.equals(byHourList);
			case SchedulePackage.RECURRENCE_RULE__BY_MINUTE_LIST:
				return BY_MINUTE_LIST_EDEFAULT == null ? byMinuteList != null : !BY_MINUTE_LIST_EDEFAULT.equals(byMinuteList);
			case SchedulePackage.RECURRENCE_RULE__BY_MONTH_DAY_LIST:
				return BY_MONTH_DAY_LIST_EDEFAULT == null ? byMonthDayList != null : !BY_MONTH_DAY_LIST_EDEFAULT.equals(byMonthDayList);
			case SchedulePackage.RECURRENCE_RULE__BY_MONTH_LIST:
				return BY_MONTH_LIST_EDEFAULT == null ? byMonthList != null : !BY_MONTH_LIST_EDEFAULT.equals(byMonthList);
			case SchedulePackage.RECURRENCE_RULE__BY_SECOND_LIST:
				return BY_SECOND_LIST_EDEFAULT == null ? bySecondList != null : !BY_SECOND_LIST_EDEFAULT.equals(bySecondList);
			case SchedulePackage.RECURRENCE_RULE__BY_SET_POS_LIST:
				return BY_SET_POS_LIST_EDEFAULT == null ? bySetPosList != null : !BY_SET_POS_LIST_EDEFAULT.equals(bySetPosList);
			case SchedulePackage.RECURRENCE_RULE__BY_WEEK_NO_LIST:
				return BY_WEEK_NO_LIST_EDEFAULT == null ? byWeekNoList != null : !BY_WEEK_NO_LIST_EDEFAULT.equals(byWeekNoList);
			case SchedulePackage.RECURRENCE_RULE__BY_YEAR_DAY_LIST:
				return BY_YEAR_DAY_LIST_EDEFAULT == null ? byYearDayList != null : !BY_YEAR_DAY_LIST_EDEFAULT.equals(byYearDayList);
			case SchedulePackage.RECURRENCE_RULE__COUNT_NUMBER:
				return countNumber != COUNT_NUMBER_EDEFAULT;
			case SchedulePackage.RECURRENCE_RULE__FREQUENCY:
				return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
			case SchedulePackage.RECURRENCE_RULE__INTERVAL_NUMBER:
				return intervalNumber != INTERVAL_NUMBER_EDEFAULT;
			case SchedulePackage.RECURRENCE_RULE__UNTIL_DATE_TIME:
				return UNTIL_DATE_TIME_EDEFAULT == null ? untilDateTime != null : !UNTIL_DATE_TIME_EDEFAULT.equals(untilDateTime);
			case SchedulePackage.RECURRENCE_RULE__WEEK_START:
				return WEEK_START_EDEFAULT == null ? weekStart != null : !WEEK_START_EDEFAULT.equals(weekStart);
			case SchedulePackage.RECURRENCE_RULE__XNAME:
				return XNAME_EDEFAULT == null ? xName != null : !XNAME_EDEFAULT.equals(xName);
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
		result.append(" (recurrenceRuleId: ");
		result.append(recurrenceRuleId);
		result.append(", byDayList: ");
		result.append(byDayList);
		result.append(", byHourList: ");
		result.append(byHourList);
		result.append(", byMinuteList: ");
		result.append(byMinuteList);
		result.append(", byMonthDayList: ");
		result.append(byMonthDayList);
		result.append(", byMonthList: ");
		result.append(byMonthList);
		result.append(", bySecondList: ");
		result.append(bySecondList);
		result.append(", bySetPosList: ");
		result.append(bySetPosList);
		result.append(", byWeekNoList: ");
		result.append(byWeekNoList);
		result.append(", byYearDayList: ");
		result.append(byYearDayList);
		result.append(", countNumber: ");
		result.append(countNumber);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", intervalNumber: ");
		result.append(intervalNumber);
		result.append(", untilDateTime: ");
		result.append(untilDateTime);
		result.append(", weekStart: ");
		result.append(weekStart);
		result.append(", xName: ");
		result.append(xName);
		result.append(')');
		return result.toString();
	}

} //RecurrenceRuleImpl
