/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tech Data Calendar Exc Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getCalendarId <em>Calendar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getExceptionDateStart <em>Exception Date Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getCalendarWeekId <em>Calendar Week Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcWeek()
 * @model annotation="mimo-ent-frame help='Used to defined some weeks which differ from the normal week defined in the calendar.' title='Calendar Exception Week' formula='description'"
 * @generated
 */
public interface TechDataCalendarExcWeek extends BizEntity {
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
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcWeek_CalendarId()
	 * @model keys="calendarId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	TechDataCalendar getCalendarId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getCalendarId <em>Calendar Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar Id</em>' reference.
	 * @see #getCalendarId()
	 * @generated
	 */
	void setCalendarId(TechDataCalendar value);

	/**
	 * Returns the value of the '<em><b>Exception Date Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Date Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Date Start</em>' attribute.
	 * @see #setExceptionDateStart(Date)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcWeek_ExceptionDateStart()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getExceptionDateStart();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getExceptionDateStart <em>Exception Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Date Start</em>' attribute.
	 * @see #getExceptionDateStart()
	 * @generated
	 */
	void setExceptionDateStart(Date value);

	/**
	 * Returns the value of the '<em><b>Calendar Week Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendar Week Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar Week Id</em>' reference.
	 * @see #setCalendarWeekId(TechDataCalendarWeek)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcWeek_CalendarWeekId()
	 * @model keys="calendarWeekId"
	 * @generated
	 */
	TechDataCalendarWeek getCalendarWeekId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getCalendarWeekId <em>Calendar Week Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar Week Id</em>' reference.
	 * @see #getCalendarWeekId()
	 * @generated
	 */
	void setCalendarWeekId(TechDataCalendarWeek value);

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
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcWeek_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // TechDataCalendarExcWeek
