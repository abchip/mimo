/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay;
import org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tech Data Calendar Exc Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl#getCalendarId <em>Calendar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl#getExceptionDateStartTime <em>Exception Date Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl#getExceptionCapacity <em>Exception Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl#getUsedCapacity <em>Used Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechDataCalendarExcDayImpl extends BizEntityImpl implements TechDataCalendarExcDay {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechDataCalendarExcDayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_DAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechDataCalendar getCalendarId() {
		return (TechDataCalendar)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_DAY__CALENDAR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarId(TechDataCalendar newCalendarId) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_DAY__CALENDAR_ID, newCalendarId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExceptionDateStartTime() {
		return (Date)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_DATE_START_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionDateStartTime(Date newExceptionDateStartTime) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_DATE_START_TIME, newExceptionDateStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_DAY__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_DAY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getExceptionCapacity() {
		return (BigDecimal)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_CAPACITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionCapacity(BigDecimal newExceptionCapacity) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_CAPACITY, newExceptionCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUsedCapacity() {
		return (BigDecimal)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_DAY__USED_CAPACITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedCapacity(BigDecimal newUsedCapacity) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_DAY__USED_CAPACITY, newUsedCapacity);
	}

} //TechDataCalendarExcDayImpl
