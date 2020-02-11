/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataFactory
 * @model kind="package"
 * @generated
 */
public interface TechdataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "techdata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/manufacturing/techdata";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-techdata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TechdataPackage eINSTANCE = org.abchip.mimo.biz.manufacturing.techdata.impl.TechdataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl <em>Tech Data Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl
	 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechdataPackageImpl#getTechDataCalendar()
	 * @generated
	 */
	int TECH_DATA_CALENDAR = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Calendar Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR__CALENDAR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calendar Week Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR__CALENDAR_WEEK_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tech Data Calendar Exc Daies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_DAIES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tech Data Calendar Exc Weeks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_WEEKS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tech Data Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl <em>Tech Data Calendar Exc Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl
	 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechdataPackageImpl#getTechDataCalendarExcDay()
	 * @generated
	 */
	int TECH_DATA_CALENDAR_EXC_DAY = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_DAY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_DAY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_DAY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_DAY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Calendar Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_DAY__CALENDAR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exception Date Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_DATE_START_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_DAY__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exception Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_CAPACITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Used Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_DAY__USED_CAPACITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tech Data Calendar Exc Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_DAY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl <em>Tech Data Calendar Exc Week</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl
	 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechdataPackageImpl#getTechDataCalendarExcWeek()
	 * @generated
	 */
	int TECH_DATA_CALENDAR_EXC_WEEK = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_WEEK__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_WEEK__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_WEEK__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_WEEK__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Calendar Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exception Date Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Calendar Week Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tech Data Calendar Exc Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_EXC_WEEK_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl <em>Tech Data Calendar Week</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl
	 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechdataPackageImpl#getTechDataCalendarWeek()
	 * @generated
	 */
	int TECH_DATA_CALENDAR_WEEK = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Calendar Week Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__CALENDAR_WEEK_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Friday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__FRIDAY_CAPACITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Friday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__FRIDAY_START_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Monday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__MONDAY_CAPACITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Monday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__MONDAY_START_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Saturday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__SATURDAY_CAPACITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Saturday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__SATURDAY_START_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sunday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__SUNDAY_CAPACITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sunday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__SUNDAY_START_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Thursday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__THURSDAY_CAPACITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Thursday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__THURSDAY_START_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tuesday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__TUESDAY_CAPACITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tuesday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__TUESDAY_START_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Wednesday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__WEDNESDAY_CAPACITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Wednesday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK__WEDNESDAY_START_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Tech Data Calendar Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DATA_CALENDAR_WEEK_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar <em>Tech Data Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tech Data Calendar</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar
	 * @generated
	 */
	EClass getTechDataCalendar();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getCalendarId <em>Calendar Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getCalendarId()
	 * @see #getTechDataCalendar()
	 * @generated
	 */
	EAttribute getTechDataCalendar_CalendarId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getCalendarWeekId <em>Calendar Week Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calendar Week Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getCalendarWeekId()
	 * @see #getTechDataCalendar()
	 * @generated
	 */
	EReference getTechDataCalendar_CalendarWeekId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getDescription()
	 * @see #getTechDataCalendar()
	 * @generated
	 */
	EAttribute getTechDataCalendar_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getTechDataCalendarExcDaies <em>Tech Data Calendar Exc Daies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tech Data Calendar Exc Daies</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getTechDataCalendarExcDaies()
	 * @see #getTechDataCalendar()
	 * @generated
	 */
	EReference getTechDataCalendar_TechDataCalendarExcDaies();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getTechDataCalendarExcWeeks <em>Tech Data Calendar Exc Weeks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tech Data Calendar Exc Weeks</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar#getTechDataCalendarExcWeeks()
	 * @see #getTechDataCalendar()
	 * @generated
	 */
	EReference getTechDataCalendar_TechDataCalendarExcWeeks();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay <em>Tech Data Calendar Exc Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tech Data Calendar Exc Day</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay
	 * @generated
	 */
	EClass getTechDataCalendarExcDay();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getCalendarId <em>Calendar Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calendar Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getCalendarId()
	 * @see #getTechDataCalendarExcDay()
	 * @generated
	 */
	EReference getTechDataCalendarExcDay_CalendarId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getExceptionDateStartTime <em>Exception Date Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Date Start Time</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getExceptionDateStartTime()
	 * @see #getTechDataCalendarExcDay()
	 * @generated
	 */
	EAttribute getTechDataCalendarExcDay_ExceptionDateStartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getDescription()
	 * @see #getTechDataCalendarExcDay()
	 * @generated
	 */
	EAttribute getTechDataCalendarExcDay_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getExceptionCapacity <em>Exception Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Capacity</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getExceptionCapacity()
	 * @see #getTechDataCalendarExcDay()
	 * @generated
	 */
	EAttribute getTechDataCalendarExcDay_ExceptionCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getUsedCapacity <em>Used Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used Capacity</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay#getUsedCapacity()
	 * @see #getTechDataCalendarExcDay()
	 * @generated
	 */
	EAttribute getTechDataCalendarExcDay_UsedCapacity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek <em>Tech Data Calendar Exc Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tech Data Calendar Exc Week</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek
	 * @generated
	 */
	EClass getTechDataCalendarExcWeek();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getCalendarId <em>Calendar Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calendar Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getCalendarId()
	 * @see #getTechDataCalendarExcWeek()
	 * @generated
	 */
	EReference getTechDataCalendarExcWeek_CalendarId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getExceptionDateStart <em>Exception Date Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Date Start</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getExceptionDateStart()
	 * @see #getTechDataCalendarExcWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarExcWeek_ExceptionDateStart();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getCalendarWeekId <em>Calendar Week Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calendar Week Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getCalendarWeekId()
	 * @see #getTechDataCalendarExcWeek()
	 * @generated
	 */
	EReference getTechDataCalendarExcWeek_CalendarWeekId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek#getDescription()
	 * @see #getTechDataCalendarExcWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarExcWeek_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek <em>Tech Data Calendar Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tech Data Calendar Week</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek
	 * @generated
	 */
	EClass getTechDataCalendarWeek();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getCalendarWeekId <em>Calendar Week Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar Week Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getCalendarWeekId()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_CalendarWeekId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getDescription()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getFridayCapacity <em>Friday Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friday Capacity</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getFridayCapacity()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_FridayCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getFridayStartTime <em>Friday Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friday Start Time</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getFridayStartTime()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_FridayStartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getMondayCapacity <em>Monday Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monday Capacity</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getMondayCapacity()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_MondayCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getMondayStartTime <em>Monday Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monday Start Time</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getMondayStartTime()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_MondayStartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSaturdayCapacity <em>Saturday Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saturday Capacity</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSaturdayCapacity()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_SaturdayCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSaturdayStartTime <em>Saturday Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saturday Start Time</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSaturdayStartTime()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_SaturdayStartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSundayCapacity <em>Sunday Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sunday Capacity</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSundayCapacity()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_SundayCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSundayStartTime <em>Sunday Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sunday Start Time</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSundayStartTime()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_SundayStartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getThursdayCapacity <em>Thursday Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thursday Capacity</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getThursdayCapacity()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_ThursdayCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getThursdayStartTime <em>Thursday Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thursday Start Time</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getThursdayStartTime()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_ThursdayStartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getTuesdayCapacity <em>Tuesday Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tuesday Capacity</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getTuesdayCapacity()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_TuesdayCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getTuesdayStartTime <em>Tuesday Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tuesday Start Time</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getTuesdayStartTime()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_TuesdayStartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getWednesdayCapacity <em>Wednesday Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wednesday Capacity</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getWednesdayCapacity()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_WednesdayCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getWednesdayStartTime <em>Wednesday Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wednesday Start Time</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getWednesdayStartTime()
	 * @see #getTechDataCalendarWeek()
	 * @generated
	 */
	EAttribute getTechDataCalendarWeek_WednesdayStartTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TechdataFactory getTechdataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl <em>Tech Data Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl
		 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechdataPackageImpl#getTechDataCalendar()
		 * @generated
		 */
		EClass TECH_DATA_CALENDAR = eINSTANCE.getTechDataCalendar();

		/**
		 * The meta object literal for the '<em><b>Calendar Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR__CALENDAR_ID = eINSTANCE.getTechDataCalendar_CalendarId();

		/**
		 * The meta object literal for the '<em><b>Calendar Week Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_DATA_CALENDAR__CALENDAR_WEEK_ID = eINSTANCE.getTechDataCalendar_CalendarWeekId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR__DESCRIPTION = eINSTANCE.getTechDataCalendar_Description();

		/**
		 * The meta object literal for the '<em><b>Tech Data Calendar Exc Daies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_DAIES = eINSTANCE.getTechDataCalendar_TechDataCalendarExcDaies();

		/**
		 * The meta object literal for the '<em><b>Tech Data Calendar Exc Weeks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_WEEKS = eINSTANCE.getTechDataCalendar_TechDataCalendarExcWeeks();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl <em>Tech Data Calendar Exc Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl
		 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechdataPackageImpl#getTechDataCalendarExcDay()
		 * @generated
		 */
		EClass TECH_DATA_CALENDAR_EXC_DAY = eINSTANCE.getTechDataCalendarExcDay();

		/**
		 * The meta object literal for the '<em><b>Calendar Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_DATA_CALENDAR_EXC_DAY__CALENDAR_ID = eINSTANCE.getTechDataCalendarExcDay_CalendarId();

		/**
		 * The meta object literal for the '<em><b>Exception Date Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_DATE_START_TIME = eINSTANCE.getTechDataCalendarExcDay_ExceptionDateStartTime();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_EXC_DAY__DESCRIPTION = eINSTANCE.getTechDataCalendarExcDay_Description();

		/**
		 * The meta object literal for the '<em><b>Exception Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_CAPACITY = eINSTANCE.getTechDataCalendarExcDay_ExceptionCapacity();

		/**
		 * The meta object literal for the '<em><b>Used Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_EXC_DAY__USED_CAPACITY = eINSTANCE.getTechDataCalendarExcDay_UsedCapacity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl <em>Tech Data Calendar Exc Week</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl
		 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechdataPackageImpl#getTechDataCalendarExcWeek()
		 * @generated
		 */
		EClass TECH_DATA_CALENDAR_EXC_WEEK = eINSTANCE.getTechDataCalendarExcWeek();

		/**
		 * The meta object literal for the '<em><b>Calendar Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID = eINSTANCE.getTechDataCalendarExcWeek_CalendarId();

		/**
		 * The meta object literal for the '<em><b>Exception Date Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START = eINSTANCE.getTechDataCalendarExcWeek_ExceptionDateStart();

		/**
		 * The meta object literal for the '<em><b>Calendar Week Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID = eINSTANCE.getTechDataCalendarExcWeek_CalendarWeekId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION = eINSTANCE.getTechDataCalendarExcWeek_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl <em>Tech Data Calendar Week</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl
		 * @see org.abchip.mimo.biz.manufacturing.techdata.impl.TechdataPackageImpl#getTechDataCalendarWeek()
		 * @generated
		 */
		EClass TECH_DATA_CALENDAR_WEEK = eINSTANCE.getTechDataCalendarWeek();

		/**
		 * The meta object literal for the '<em><b>Calendar Week Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__CALENDAR_WEEK_ID = eINSTANCE.getTechDataCalendarWeek_CalendarWeekId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__DESCRIPTION = eINSTANCE.getTechDataCalendarWeek_Description();

		/**
		 * The meta object literal for the '<em><b>Friday Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__FRIDAY_CAPACITY = eINSTANCE.getTechDataCalendarWeek_FridayCapacity();

		/**
		 * The meta object literal for the '<em><b>Friday Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__FRIDAY_START_TIME = eINSTANCE.getTechDataCalendarWeek_FridayStartTime();

		/**
		 * The meta object literal for the '<em><b>Monday Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__MONDAY_CAPACITY = eINSTANCE.getTechDataCalendarWeek_MondayCapacity();

		/**
		 * The meta object literal for the '<em><b>Monday Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__MONDAY_START_TIME = eINSTANCE.getTechDataCalendarWeek_MondayStartTime();

		/**
		 * The meta object literal for the '<em><b>Saturday Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__SATURDAY_CAPACITY = eINSTANCE.getTechDataCalendarWeek_SaturdayCapacity();

		/**
		 * The meta object literal for the '<em><b>Saturday Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__SATURDAY_START_TIME = eINSTANCE.getTechDataCalendarWeek_SaturdayStartTime();

		/**
		 * The meta object literal for the '<em><b>Sunday Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__SUNDAY_CAPACITY = eINSTANCE.getTechDataCalendarWeek_SundayCapacity();

		/**
		 * The meta object literal for the '<em><b>Sunday Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__SUNDAY_START_TIME = eINSTANCE.getTechDataCalendarWeek_SundayStartTime();

		/**
		 * The meta object literal for the '<em><b>Thursday Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__THURSDAY_CAPACITY = eINSTANCE.getTechDataCalendarWeek_ThursdayCapacity();

		/**
		 * The meta object literal for the '<em><b>Thursday Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__THURSDAY_START_TIME = eINSTANCE.getTechDataCalendarWeek_ThursdayStartTime();

		/**
		 * The meta object literal for the '<em><b>Tuesday Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__TUESDAY_CAPACITY = eINSTANCE.getTechDataCalendarWeek_TuesdayCapacity();

		/**
		 * The meta object literal for the '<em><b>Tuesday Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__TUESDAY_START_TIME = eINSTANCE.getTechDataCalendarWeek_TuesdayStartTime();

		/**
		 * The meta object literal for the '<em><b>Wednesday Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__WEDNESDAY_CAPACITY = eINSTANCE.getTechDataCalendarWeek_WednesdayCapacity();

		/**
		 * The meta object literal for the '<em><b>Wednesday Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECH_DATA_CALENDAR_WEEK__WEDNESDAY_START_TIME = eINSTANCE.getTechDataCalendarWeek_WednesdayStartTime();

	}

} //TechdataPackage
