/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata.impl;

import java.util.List;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek;
import org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tech Data Calendar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl#getCalendarId <em>Calendar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl#getCalendarWeekId <em>Calendar Week Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl#getTechDataCalendarExcDaies <em>Tech Data Calendar Exc Daies</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl#getTechDataCalendarExcWeeks <em>Tech Data Calendar Exc Weeks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechDataCalendarImpl extends BizEntityImpl implements TechDataCalendar {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechDataCalendarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechdataPackage.Literals.TECH_DATA_CALENDAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCalendarId() {
		return (String)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR__CALENDAR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarId(String newCalendarId) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR__CALENDAR_ID, newCalendarId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechDataCalendarWeek getCalendarWeekId() {
		return (TechDataCalendarWeek)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR__CALENDAR_WEEK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarWeekId(TechDataCalendarWeek newCalendarWeekId) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR__CALENDAR_WEEK_ID, newCalendarWeekId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TechDataCalendarExcDay> getTechDataCalendarExcDaies() {
		return (List<TechDataCalendarExcDay>)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_DAIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TechDataCalendarExcWeek> getTechDataCalendarExcWeeks() {
		return (List<TechDataCalendarExcWeek>)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_WEEKS, true);
	}

} //TechDataCalendarImpl
