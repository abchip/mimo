/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek;
import org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tech Data Calendar Exc Week</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getCalendarId <em>Calendar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getExceptionDateStart <em>Exception Date Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getCalendarWeekId <em>Calendar Week Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechDataCalendarExcWeekImpl extends BizEntityImpl implements TechDataCalendarExcWeek {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechDataCalendarExcWeekImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechDataCalendar getCalendarId() {
		return (TechDataCalendar)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarId(TechDataCalendar newCalendarId) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID, newCalendarId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExceptionDateStart() {
		return (Date)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionDateStart(Date newExceptionDateStart) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START, newExceptionDateStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechDataCalendarWeek getCalendarWeekId() {
		return (TechDataCalendarWeek)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarWeekId(TechDataCalendarWeek newCalendarWeekId) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID, newCalendarWeekId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION, newDescription);
	}

} //TechDataCalendarExcWeekImpl
