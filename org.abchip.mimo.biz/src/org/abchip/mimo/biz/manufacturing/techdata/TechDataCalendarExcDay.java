/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tech Data Calendar Exc Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getCalendarId <em>Calendar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getExceptionDateStartTime <em>Exception Date Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getExceptionCapacity <em>Exception Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getUsedCapacity <em>Used Capacity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcDay()
 * @model annotation="mimo-ent-frame help='Used to defined some days which differ from the normal day definition in the weekId associated in the calendar.' title='Calendar Exception Day' formula='description'"
 * @generated
 */
public interface TechDataCalendarExcDay extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Calendar Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendar Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar Id</em>' reference.
	 * @see #setCalendarId(TechDataCalendar)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcDay_CalendarId()
	 * @model keys="calendarId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	TechDataCalendar getCalendarId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getCalendarId <em>Calendar Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar Id</em>' reference.
	 * @see #getCalendarId()
	 * @generated
	 */
	void setCalendarId(TechDataCalendar value);

	/**
	 * Returns the value of the '<em><b>Exception Date Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Date Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Date Start Time</em>' attribute.
	 * @see #setExceptionDateStartTime(Date)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcDay_ExceptionDateStartTime()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getExceptionDateStartTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getExceptionDateStartTime <em>Exception Date Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Date Start Time</em>' attribute.
	 * @see #getExceptionDateStartTime()
	 * @generated
	 */
	void setExceptionDateStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcDay_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Exception Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Capacity</em>' attribute.
	 * @see #setExceptionCapacity(BigDecimal)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcDay_ExceptionCapacity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getExceptionCapacity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getExceptionCapacity <em>Exception Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Capacity</em>' attribute.
	 * @see #getExceptionCapacity()
	 * @generated
	 */
	void setExceptionCapacity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Used Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Capacity</em>' attribute.
	 * @see #setUsedCapacity(BigDecimal)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcDay_UsedCapacity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getUsedCapacity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getUsedCapacity <em>Used Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Capacity</em>' attribute.
	 * @see #getUsedCapacity()
	 * @generated
	 */
	void setUsedCapacity(BigDecimal value);

} // TechDataCalendarExcDay
