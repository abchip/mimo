/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tech Data Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getCalendarId <em>Calendar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getCalendarWeekId <em>Calendar Week Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getTechDataCalendarExcDaies <em>Tech Data Calendar Exc Daies</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getTechDataCalendarExcWeeks <em>Tech Data Calendar Exc Weeks</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendar()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface TechDataCalendar extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Calendar Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendar Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar Id</em>' attribute.
	 * @see #setCalendarId(String)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendar_CalendarId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getCalendarId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getCalendarId <em>Calendar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar Id</em>' attribute.
	 * @see #getCalendarId()
	 * @generated
	 */
	void setCalendarId(String value);

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
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendar_CalendarWeekId()
	 * @model keys="calendarWeekId"
	 * @generated
	 */
	TechDataCalendarWeek getCalendarWeekId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getCalendarWeekId <em>Calendar Week Id</em>}' reference.
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
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendar_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Tech Data Calendar Exc Daies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tech Data Calendar Exc Daies</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tech Data Calendar Exc Daies</em>' attribute list.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendar_TechDataCalendarExcDaies()
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TechDataCalendarExcDay'"
	 * @generated
	 */
	List<String> getTechDataCalendarExcDaies();

	/**
	 * Returns the value of the '<em><b>Tech Data Calendar Exc Weeks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tech Data Calendar Exc Weeks</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tech Data Calendar Exc Weeks</em>' attribute list.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendar_TechDataCalendarExcWeeks()
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TechDataCalendarExcWeek'"
	 * @generated
	 */
	List<String> getTechDataCalendarExcWeeks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAsset' route='calendarId'"
	 * @generated
	 */
	List<String> fixedAssets();

} // TechDataCalendar
