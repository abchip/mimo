/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule;

import java.util.Date;
import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurrence Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getRecurrenceRuleId <em>Recurrence Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByDayList <em>By Day List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByHourList <em>By Hour List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByMinuteList <em>By Minute List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByMonthDayList <em>By Month Day List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByMonthList <em>By Month List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getBySecondList <em>By Second List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getBySetPosList <em>By Set Pos List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByWeekNoList <em>By Week No List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByYearDayList <em>By Year Day List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getCountNumber <em>Count Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getIntervalNumber <em>Interval Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getUntilDateTime <em>Until Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getWeekStart <em>Week Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getXName <em>XName</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule()
 * @model
 * @generated
 */
public interface RecurrenceRule extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Recurrence Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Rule Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Rule Id</em>' attribute.
	 * @see #setRecurrenceRuleId(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_RecurrenceRuleId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRecurrenceRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getRecurrenceRuleId <em>Recurrence Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Rule Id</em>' attribute.
	 * @see #getRecurrenceRuleId()
	 * @generated
	 */
	void setRecurrenceRuleId(String value);

	/**
	 * Returns the value of the '<em><b>By Day List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Day List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Day List</em>' attribute.
	 * @see #setByDayList(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_ByDayList()
	 * @model
	 * @generated
	 */
	String getByDayList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByDayList <em>By Day List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Day List</em>' attribute.
	 * @see #getByDayList()
	 * @generated
	 */
	void setByDayList(String value);

	/**
	 * Returns the value of the '<em><b>By Hour List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Hour List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Hour List</em>' attribute.
	 * @see #setByHourList(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_ByHourList()
	 * @model
	 * @generated
	 */
	String getByHourList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByHourList <em>By Hour List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Hour List</em>' attribute.
	 * @see #getByHourList()
	 * @generated
	 */
	void setByHourList(String value);

	/**
	 * Returns the value of the '<em><b>By Minute List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Minute List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Minute List</em>' attribute.
	 * @see #setByMinuteList(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_ByMinuteList()
	 * @model
	 * @generated
	 */
	String getByMinuteList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByMinuteList <em>By Minute List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Minute List</em>' attribute.
	 * @see #getByMinuteList()
	 * @generated
	 */
	void setByMinuteList(String value);

	/**
	 * Returns the value of the '<em><b>By Month Day List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Month Day List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Month Day List</em>' attribute.
	 * @see #setByMonthDayList(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_ByMonthDayList()
	 * @model
	 * @generated
	 */
	String getByMonthDayList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByMonthDayList <em>By Month Day List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Month Day List</em>' attribute.
	 * @see #getByMonthDayList()
	 * @generated
	 */
	void setByMonthDayList(String value);

	/**
	 * Returns the value of the '<em><b>By Month List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Month List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Month List</em>' attribute.
	 * @see #setByMonthList(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_ByMonthList()
	 * @model
	 * @generated
	 */
	String getByMonthList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByMonthList <em>By Month List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Month List</em>' attribute.
	 * @see #getByMonthList()
	 * @generated
	 */
	void setByMonthList(String value);

	/**
	 * Returns the value of the '<em><b>By Second List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Second List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Second List</em>' attribute.
	 * @see #setBySecondList(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_BySecondList()
	 * @model
	 * @generated
	 */
	String getBySecondList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getBySecondList <em>By Second List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Second List</em>' attribute.
	 * @see #getBySecondList()
	 * @generated
	 */
	void setBySecondList(String value);

	/**
	 * Returns the value of the '<em><b>By Set Pos List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Set Pos List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Set Pos List</em>' attribute.
	 * @see #setBySetPosList(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_BySetPosList()
	 * @model
	 * @generated
	 */
	String getBySetPosList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getBySetPosList <em>By Set Pos List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Set Pos List</em>' attribute.
	 * @see #getBySetPosList()
	 * @generated
	 */
	void setBySetPosList(String value);

	/**
	 * Returns the value of the '<em><b>By Week No List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Week No List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Week No List</em>' attribute.
	 * @see #setByWeekNoList(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_ByWeekNoList()
	 * @model
	 * @generated
	 */
	String getByWeekNoList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByWeekNoList <em>By Week No List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Week No List</em>' attribute.
	 * @see #getByWeekNoList()
	 * @generated
	 */
	void setByWeekNoList(String value);

	/**
	 * Returns the value of the '<em><b>By Year Day List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Year Day List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Year Day List</em>' attribute.
	 * @see #setByYearDayList(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_ByYearDayList()
	 * @model
	 * @generated
	 */
	String getByYearDayList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getByYearDayList <em>By Year Day List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Year Day List</em>' attribute.
	 * @see #getByYearDayList()
	 * @generated
	 */
	void setByYearDayList(String value);

	/**
	 * Returns the value of the '<em><b>Count Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Number</em>' attribute.
	 * @see #setCountNumber(long)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_CountNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getCountNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getCountNumber <em>Count Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Number</em>' attribute.
	 * @see #getCountNumber()
	 * @generated
	 */
	void setCountNumber(long value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_Frequency()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getFrequency();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(String value);

	/**
	 * Returns the value of the '<em><b>Interval Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Number</em>' attribute.
	 * @see #setIntervalNumber(long)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_IntervalNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getIntervalNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getIntervalNumber <em>Interval Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Number</em>' attribute.
	 * @see #getIntervalNumber()
	 * @generated
	 */
	void setIntervalNumber(long value);

	/**
	 * Returns the value of the '<em><b>Until Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Date Time</em>' attribute.
	 * @see #setUntilDateTime(Date)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_UntilDateTime()
	 * @model
	 * @generated
	 */
	Date getUntilDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getUntilDateTime <em>Until Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Date Time</em>' attribute.
	 * @see #getUntilDateTime()
	 * @generated
	 */
	void setUntilDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Week Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Week Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Week Start</em>' attribute.
	 * @see #setWeekStart(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_WeekStart()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getWeekStart();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getWeekStart <em>Week Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Week Start</em>' attribute.
	 * @see #getWeekStart()
	 * @generated
	 */
	void setWeekStart(String value);

	/**
	 * Returns the value of the '<em><b>XName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XName</em>' attribute.
	 * @see #setXName(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRecurrenceRule_XName()
	 * @model
	 * @generated
	 */
	String getXName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RecurrenceRule#getXName <em>XName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XName</em>' attribute.
	 * @see #getXName()
	 * @generated
	 */
	void setXName(String value);

} // RecurrenceRule
